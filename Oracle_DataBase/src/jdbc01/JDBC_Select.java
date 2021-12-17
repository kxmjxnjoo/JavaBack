package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Select {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OarcleDriver";
		String id ="scott";
		String pw = "tirger";
		
		Connection con = null; //연결을 위한 객체 
		PreparedStatement pstmt = null; //con에 SQL 실행해주는 객체
		ResultSet rs = null; // SQL실행결과를 저장하는 객체
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			//System.out.println("데이버테이스에 연결 성공했습니다");
			String sql = "select * from customer";
			//pstmt에 sql을 장착하고 실행해서 그 결과를 rs에 저장
			//저장결과를 하나씩 레코드, 필드 별로 하나씩 꺼내서 
			//콘솔 창에 출력함
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		}
		try {
			if(con !=null ) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null)rs.close();
		} catch (SQLException e) {e.printStackTrace();
		}
	}
}