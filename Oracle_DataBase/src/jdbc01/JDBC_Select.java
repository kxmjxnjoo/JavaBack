package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Select {

	public static void main(String[] args) {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id ="scott";
		String pw = "tiger";
		Connection con = null; //연결을 위한 객체 
		PreparedStatement pstmt = null; //con에 SQL 실행해주는 객체
		ResultSet rs = null; // SQL실행결과를 저장하는 객체
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("데이버테이스에 연결 성공했습니다");
			String sql = "select * from customer";
			//데이터베이스 연결후에는 SQl 명령을 사용하기 위해 String 변수에 SQL명령을 
			//준비함. 데이터 베이스에 제공되어질 명령이므로 String 형으로 준비함 
			
			//SQL문을 장착한 con을 pstmt에 전달함
			pstmt = con.prepareStatement(sql);
			//pstmt= con.prepareStatement("select * from customer");
			
			//pstmt에 담겨진 SQL명령 실행하고 그 결과를 rs에 저장함
			rs = pstmt.executeQuery();
			
			System.out.println("번호 \t 이름 \t\t 이메일 \t\t\t 전화번호");
			System.out.println("--------------------------------------------------------------");
			//rs.next(): 최초 실행은 객체의 시작부분(데이터 없는 곳)에서 첫번째 레코드로 이동하는 메소드
			//그다음부터는 다음 레코드로 이동
			//rs.next(): 메소드가 실행 될 떄 다음 레코드가 있으면 true없으면 false리턴
			
			while(rs.next()) {
				//결과의 처음부터 끝까지 반복 실행 : 레코드 단위로 반복 실행
				//rs.hetInt():number형 필드값을 추출하는 메소드. 
				//괄호안에 필드이름을 정확히 써야함 -> 문자형 자료형은 getString() 이용함
				//필드명에 오타가 있거나 안맞으면 부적합한 열이름이라는 에러가 발생
				int num = rs.getInt("num");
				//rs.getString() : varchar2형 필드값을 추출하는 메소드
				//모든 자료형에 대해 get~()메소드가 존재함
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				System.out.printf("%d \t %s \t %s \t %s \n", num, name, email, tel);
			}
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