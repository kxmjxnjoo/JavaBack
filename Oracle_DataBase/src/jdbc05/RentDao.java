package jdbc05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RentDao {

	private RentDao() {}
	private static RentDao itc = new RentDao();
	public static RentDao getInstance() { return itc; }
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	

	
	public ArrayList<RentDto> select(){
		ArrayList<RentDto> list = new ArrayList<RentDto>();
		con = DBmanager.getConnection();
		// 테이블의 rentdate  필드 : Date  형식  -> Dto 의 rentDate :String 으로 변환해서 저장
		//   Select 문안에서  to_Char() 함수가 사용이 되야 가능합니다.
		String sql = "select    to_char( rentdate, 'YYYY-MM-DD') as rd  , "
				+ "num, booknum, membernum, discount from rentlist order by num desc";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				RentDto rdto = new RentDto();
				rdto.setRentdate(  rs.getString("rd")  );
				rdto.setNum( rs.getInt("num") );
				rdto.setBooknum( rs.getInt("booknum") );
				rdto.setMembernum( rs.getInt("membernum") );
				rdto.setDiscount( rs.getInt("discount") );
				list.add(rdto);
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { 		DBmanager.close( con, pstmt, rs );  }
		return list;
	}
	
	public ArrayList<RentDetailDto> selectAll(){
		ArrayList<RentDetailDto> list = new ArrayList<RentDetailDto>();
		/* String sql = "select to_char(a.rentdate, 'YYYY-MM-DD') as rentdate,"
			            + " a.num as rentnum, "
			            + " c.num as membernum, c.name as membername, "
			            + "    b.rentprice - a.discount as rentprice2,"
			            + "   b.num as booknum , b.subject as subject"
			            + " from rentlist a, booklist b, memberlist c"
			            + " where a.booknum = b.num and a.membernum = c.num "
			            + " order by a.num desc"; */
		String sql = "select * from rentdetail"; //View생성 후 위를 이와 같이 줄 일 수 있음
		con = DBmanager.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				RentDetailDto rdto = new RentDetailDto();
				rdto.setRentdate(rs.getString("rentdate"));
				rdto.setRentnumber(rs.getInt("rentnum"));
				rdto.setMembernumber(rs.getInt("membernum"));
				rdto.setMembername(rs.getString("membername"));
				rdto.setRentprice2(rs.getInt("rentprice2"));
				rdto.setBooknumber(rs.getInt("booknum"));
				rdto.setSubject(rs.getString("bookname"));
				list.add(rdto);
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBmanager.close(con, pstmt, rs); 
		
		return list;
		}
	}
	
	public int insert( RentDto rdto ){
		int result = 0;
		con = DBmanager.getConnection();
		String sql = "insert into rentlist values(sysdate, rent_seq.nextVal, ? , ? , ? )";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  rdto.getBooknum() );
			pstmt.setInt(2,  rdto.getMembernum() );
			pstmt.setInt(3,  rdto.getDiscount() );
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally {		DBmanager.close( con, pstmt, rs );  }
		return result;
	}
	
	
	public RentDto getRent( int num ){
		RentDto rdto = null;
		con = DBmanager.getConnection();
		String sql = "select   to_char( rentdate , 'YYYY-MM-DD') as rd ,  num, "
				+ " booknum, membernum, discount  from rentlist where num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next() ) {
				rdto = new RentDto();
				rdto.setRentdate( rs.getString("rd") );
				rdto.setNum(num);
				rdto.setBooknum(rs.getInt("booknum"));
				rdto.setMembernum( rs.getInt("membernum") );
				rdto.setDiscount( rs.getInt("discount") );
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {	DBmanager.close( con, pstmt, rs );  
		}
		return rdto;
	}
	
	
	public int update(RentDto rdto ){
		int result = 0;
		con = DBmanager.getConnection();	
		String sql = "update rentlist set rentdate = to_date(''||?||'', 'YYYYMMDD') , "
				+ " booknum =?,  membernum=?, discount=? where num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString( 1, rdto.getRentdate() );
			pstmt.setInt(2,  rdto.getBooknum() );
			pstmt.setInt(3,  rdto.getMembernum() );
			pstmt.setInt(4,  rdto.getDiscount() );
			pstmt.setInt( 5, rdto.getNum() );
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally { 		DBmanager.close( con, pstmt, rs );  }
		return result;
	}
	
	
	
	public int delete(  int num ){
		int result = 0;
		con = DBmanager.getConnection();
		String sql = "delete from rentlist where num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally {DBmanager.close( con, pstmt, rs ); }
		return result;
	}

	

	public boolean chehckBooknum(int booknum) {
		boolean result = false;
		con = DBmanager.getConnection();	
		String sql = "select * from booklist where num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  booknum );
			rs = pstmt.executeQuery();
			if( rs.next() ) result = true;
		} catch (SQLException e) {e.printStackTrace();
		} finally { 	DBmanager.close( con, pstmt, rs );  }
		return result;
	}


	public boolean chehckMembernum(int membernum) {
		boolean result = false;
		con = DBmanager.getConnection();	
		String sql = "select * from memberlist where num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  membernum );
			rs = pstmt.executeQuery();
			if( rs.next() ) result = true;
		} catch (SQLException e) {e.printStackTrace();
		} finally { 	DBmanager.close( con, pstmt, rs );  }
		return result;
	}
}