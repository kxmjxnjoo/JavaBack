package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert {

	public static void main(String[] args) {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id ="scott";
		String pw = "tiger";
		Connection con = null; 
		PreparedStatement pstmt = null; 
		//insert명령의 경우 결과값이 따로 없어서 ResultSet은 사용하지 않음
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			//System.out.print("연결 성공");
			Scanner sc = new Scanner(System.in);
			
			//System.out.print("저장할 번호를 입력하세요: ");
			//int num= Integer.parseInt(sc.nextLine());
			System.out.print("이름을 입력하세요: ");
			String name= sc.nextLine();
			System.out.print("이메일 입력하세요: ");
			String email= sc.nextLine();
			System.out.print("전화번호를 입력하세요: ");
			String tel= sc.nextLine();
			
			//insert in customer values(6, '김하나', 'abc5@naver.com', '010-111'); 
			
			//String sql ="insert in customer values(6, '김하나', 'abc5@naver.com', '010-111');"
			/*아래는 옛날 방식
			String sql = "insert into customer values(" + num + " + " , ', '+ email + "' , '" + tel + "'')";*/
			
			//아래가 요즘 방식
			String sql = "insert into customer values( num_seq.nextVal, ? , ? , ? )";
			
			//먼저 sql 명령을 select 때와 같이 astmt에 장착함
			pstmt = con.prepareStatement(sql);
			
			// ?의 순서에 맞춰 입력값들을 세팅함
			//pstmt.setInt(1, num);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			
			//SQL select 명령만 excuteQuery를 사용하고
			//나머지는 excuteUpdate메소르들 사용함
			//excuteUpdate의 결과는 sql명령이 정상 동작했을 때 1, 실패했을 때 0리턴
			int result = pstmt.executeUpdate();
			
			if(result==1) System.out.println("레코드 추가 성공");
			else System.out.println("레코드 추가 실패");
			
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		}
		try {
			if(con !=null ) con.close();
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {e.printStackTrace();
		}
	}
}