package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book_Select {

	public static void main(String[] args) {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			String sql ="select * from booklist order by num desc";
			
			System.out.println("도서번호\t출판년도\t입고가격\t출고가격\t등급 \t 제목");
			System.out.println("-----------------------------------------------------------------------------------------");
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				int makeyear = rs.getInt("makeyear");
				int inprice = rs.getInt("inprice");
				int rentprice = rs.getInt("rentprice");
				String grade = rs.getString("grade");
				String subject = rs.getString("subject");
				System.out.printf("%8d \t %d \t %d \t %d \t%s \t %s\n", num, makeyear, inprice, rentprice, grade, subject);
			}
			
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