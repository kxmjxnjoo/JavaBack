package STUDY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc04.MemberDto;
import jdbc05.DBmanager;

public class ProductDao {
	private ProductDao() {}
	private static ProductDao itc = new ProductDao();
	public static ProductDao getInstance() { return itc; }
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public int insert(ProductDto pdto) {
		int result = 0;
		con = PRmanager.getConnection();
		String sql = "insert into productlist values(pd_seq.nextVal, ? , ? , ?, ? )";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pdto.getName() );
			pstmt.setDate(2, pdto.getMakeyear() );
			pstmt.setInt(3, pdto.getInpri() );
			pstmt.setInt(4, pdto.getSellpri() );
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally {		DBmanager.close( con, pstmt, rs );  }
		return result;
	}
	
	
	
	public ArrayList<ProductDto> select() {
		ArrayList<ProductDto> list = new ArrayList<ProductDto>();
		String sql = "select num, name, to_char(makeyear, 'YYYY-MM-DD') as rd, "
				+ "inpri, sellpri from productlist";
		con = DBmanager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				ProductDto pdto = new ProductDto();
				pdto.setNum(  rs.getInt("num")  );
				pdto.setName( rs.getString("name") );
				pdto.setMakeyear( rs.getDate("rd") );
				pdto.setInpri( rs.getInt("inpri") );
				pdto.setSellpri( rs.getInt("sellpri") );
				list.add(pdto);
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { 		PRmanager.close( con, pstmt, rs );  }
		return list;
	}
	
	
	
	public int update(ProductDto pdto) {
		int result = 0;
		String sql = "update productlist set = num, name=?, to_char(makeyear, 'YYYY-MM-DD')=?, "
				+ "inpri=?, sellpri=? where num=?";
		con = DBmanager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pdto.getNum() );
			pstmt.setString(2, pdto.getName() );
			pstmt.setDate(3, pdto.getMakeyear() );
			pstmt.setInt( 4, pdto.getInpri() );
			pstmt.setInt( 5, pdto.getSellpri() );
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally { 		PRmanager.close( con, pstmt, rs );  }
		return result;
	}

	public int delete( int num ){
		//1명의 회원번호를 전달받아서  해당 회원의 레코드를 삭제
		int result = 0;
		String sql = "delete from productlist where num=?";
		con = PRmanager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt( 1, num);			
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		}  finally { 	 PRmanager.close( con, pstmt, rs ); }
		return result;
	}



		public ProductDto getNum( int num ){
			//회원번호 하나를 전달받아서 해당 회원의 정보를  MemberDto 형태로 리턴
			ProductDto pdto = null;
			String sql = "select * from productlist where num=?";
			con =  PRmanager.getConnection();
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,  num );
				rs = pstmt.executeQuery();
				if( rs.next() ) {
					pdto = new ProductDto();
					pdto.setNum( rs.getInt("num") );
					pdto.setName( rs.getString("name") );
					pdto.setMakeyear( rs.getDate("makeyear") );
					pdto.setInpri( rs.getInt("inpri") );
					pdto.setSellpri( rs.getInt("sellpri") );
				}
			} catch (SQLException e) { e.printStackTrace();
			} finally {  PRmanager.close( con, pstmt, rs ); }
			return pdto;
	}
}