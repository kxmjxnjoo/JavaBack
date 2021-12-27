package jdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
			
	private MemberDao() {}
	private static MemberDao itc = new MemberDao();
	public static MemberDao getInstance() {return itc;}
	
	public ArrayList<MemberDto> selectAll(){
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		con = Dbman.getConnection();
		String sql = "select num, name, phone, bpoint, age, gender, "
				+ "date_format(birth, '%Y-%m-%d') as bt,"
				+ "date_format(joindate, '%Y-%m-%d') as jd "
				+ "from memberlist order by num desc";
	
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				MemberDto mdto = new MemberDto();
				mdto.setNum( rs.getInt("num"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getString("bt"));
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setJoindate(rs.getString("jd"));
				mdto.setGender(rs.getString("gender"));
				mdto.setAge(rs.getInt("age"));
				list.add(mdto);
				
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con,pstmt, rs); }
		return list;
	}
	
	
	public int insert(MemberDto mdto){
		int result = 0;
		String sql = "insert into memberlist(name, phone, birth, gender, age)"
				+ "values( ? ,?, str_to_date(concat('',?,''), '%Y-%m-%d') ,? ,? )";
		//concat(",?,") -> " : 작은 따옴표 두개, 큰따옴표 한개 아님
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName() );
			pstmt.setString(2, mdto.getPhone() );
			pstmt.setString(3, mdto.getBirth() );
			pstmt.setString(4, mdto.getGender() );
			pstmt.setInt(5, mdto.getAge() );
			
			result=pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con,pstmt, rs);}
		return result;
	}
	
	
	public int update( MemberDto mdto ){
		int result = 0;
		String sql = "update memberlist set name=?, phone=?, "
				+ " birth=str_to_date(concat('', ? , '') , '%Y-%m-%d') ,  "
				+ " joindate=str_to_date(concat('', ? , '') , '%Y-%m-%d') , "
				+ " bpoint=?,  gender=?, age=?  where num = ?";
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  mdto.getName() ); pstmt.setString(2,  mdto.getPhone() );
			pstmt.setString( 3, mdto.getBirth() ); pstmt.setString( 4, mdto.getJoindate() );
			pstmt.setInt( 5, mdto.getBpoint() ); pstmt.setString( 6, mdto.getGender() );
			pstmt.setInt( 7, mdto.getAge() ); pstmt.setInt( 8, mdto.getNum() );
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbman.close(con, pstmt, rs);  }
		return result;
	}
	
	
	
	public int delete(int num){
		int result = 0;
		con = Dbman.getConnection();
		String sql="delete from memberlist where num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con,pstmt, rs);}
		return result;
	}
	
	
	public MemberDto selectOne(int num){
		MemberDto mdto = null;
		String sql = "select num, name, phone, bpoint, age, gender,  "
				+ " date_format( birth , '%Y-%m-%d') as bt,  "
				+ " date_format( joindate ,  '%Y-%m-%d') as jd  "
				+ " from memberlist where num = ? order by num desc";
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {	
				mdto = new MemberDto();
				mdto.setNum( rs.getInt("num"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getString("bt"));
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setJoindate(rs.getString("jd"));
				mdto.setGender(rs.getString("gender"));
				mdto.setAge(rs.getInt("age"));
				
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con,pstmt, rs); }
		return mdto;
	}
	
}