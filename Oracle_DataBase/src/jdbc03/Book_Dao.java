package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Dao : Database Access Object - 데이터베이스 접근(Access) 및 처리를 담당하는 클래스객체
//dao 는 아래와 같은 네개의 기본 멤버메서드가 존재합니다. 이 네개를 CRUD(Create, Read, 
//Update, Delete) 라고 부르기도 함

public class Book_Dao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<Book_Dto> select() {
		// 테이블내용을 조회해서 결과를 리턴해주는 메소드
		ArrayList<Book_Dto> list = new ArrayList<Book_Dto>();
		String sql = "select * from booklist order by num desc";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				Book_Dto bdto = new Book_Dto();
				int num = rs.getInt("num");
				bdto.setNum(num);
				bdto.setSubject( rs.getString("subject") );
				bdto.setMakeyear( rs.getInt("makeyear") );
				bdto.setInprice( rs.getInt("inprice") );
				bdto.setRentprice( rs.getInt("rentprice") );
				bdto.setGrade( rs.getString("grade"));
				list.add( bdto );
			}
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {	e.printStackTrace();	}
		}
		return list;
	}
	
	public int insert(Book_Dto bdto) {
		int result = 0;
		// 전달된 데이터를 테이블에 레코드로 추가하는 메소드
		String sql = "insert into booklist values( book_seq.nextVal , ? , ? ,  ? , ? , ?)";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			pstmt.setString( 1,  bdto.getSubject() );
			pstmt.setInt( 2,  bdto.getMakeyear() );
			pstmt.setInt( 3,  bdto.getInprice() );
			pstmt.setInt( 4,  bdto.getRentprice() );
			pstmt.setString( 5,  bdto.getGrade() );
			
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {	e.printStackTrace();	}
		}
		return result;
	}
	
	public int update(Book_Dto bdto) {
		// 전달된 값으로 레코드를 수정하는 메소드
		int result = 0;
		String sql = "update booklist set subject=?, makeyear=?, inprice=?, "
				+ " rentprice=? , grade=?  where num=?";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");	
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  bdto.getSubject() );
			pstmt.setInt(2, bdto.getMakeyear());
			pstmt.setInt(3, bdto.getInprice());
			pstmt.setInt(4, bdto.getRentprice());
			pstmt.setString(5, bdto.getGrade());
			pstmt.setInt(6, bdto.getNum());
			
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {  e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {	e.printStackTrace();	}
		}		
		return result;
	}
	
	public int delete(int num) {
		int result = 0;
		String sql = "delete from booklist where num=?";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {	e.printStackTrace();	}
		}			
		return result;
	}

	public Book_Dto getBook(int num) {
		Book_Dto bdto = null;
		String sql = "select * from booklist where num=?";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  num);
			rs = pstmt.executeQuery();
			
			if( rs.next()) {
				bdto = new Book_Dto();
				bdto.setNum( rs.getInt("num") );
				bdto.setSubject( rs.getString("subject") );
				bdto.setMakeyear( rs.getInt("makeyear") );
				bdto.setInprice( rs.getInt("inprice") );
				bdto.setRentprice( rs.getInt("rentprice") );
				bdto.setGrade( rs.getString("grade"));
			}
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {	e.printStackTrace();	}
		}
		return bdto;
	}
}