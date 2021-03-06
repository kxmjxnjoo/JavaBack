package jdbc03;

import java.util.ArrayList;
import java.util.Scanner;

public class Book_Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while( true ) {
			System.out.println("\n--- 메뉴 선택 ---");
			System.out.printf("1. 데이터열람.  2. 데이터추가.  3. 데이터수정.  4. 데이터삭제 ");
			System.out.printf("  5. 프로그램 종료.  >>메뉴 선택 : ");			
			String choice = sc.nextLine();
			if( choice.equals("5")) break;
			Book_Dao bdao = new Book_Dao();
			switch( choice ) {
				case "1":	
					select( sc, bdao );
					break;
				case "2":
					insert( sc, bdao);
					break;
				case "3":
					update( sc, bdao );
					break;
				case "4":
					delete( sc, bdao );
					break;
				default :			System.out.println("메뉴 선택이 잘못되었습니다");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
	
	private static void delete(Scanner sc, Book_Dao bdao) {
		int num = 0;
		while(true) {
			System.out.printf("삭제할 도서번호를 입력하세요(필수)");
			String input = sc.nextLine();
			if( input.equals("") ) {
				System.out.println("도서번호 입력은 필수 입니다");
			}else {
				num = Integer.parseInt( input );
				break;
			}
		}
		int result = bdao.delete(num);
		if( result == 1 ) System.out.println(" 레코드 삭제 성공 ");
		else System.out.println(" 레코드 삭제 실패 ");		
	}

	private static void update(Scanner sc, Book_Dao bdao) {
		// 수정할 도서번호를 입력받습니다. (입력안하고 엔터치면, 다시 입력화면으로)
		int num = 0;
		while(true) {
			System.out.printf("수정할 도서번호를 입력하세요(필수)");
			String input = sc.nextLine();
			if( input.equals("") ) {
				System.out.println("도서번호 입력은 필수 입니다");
			}else {
				num = Integer.parseInt( input );
				break;
			}
		}
		
		// 도서버호로 도서하나를 조회해서  BookDto 에 담아둡니다
		Book_Dto bdto = bdao.getBook( num );
		// 도서번호로 조회한 내역이  null 이라면  해당도서가 없습니다. 라고 출력하고 종료.
		if( bdto == null ) {
			System.out.println("입력하신 도서번호로 조회된 도서가 없습니다");
			return;
		}
		
		// 수정할 사항을 차례로 모두입력할 화면을 제공하되, 수정하지 않을 항목은
		// 엔터만 입력받아 지나갑니다
		// 수정할 사항은  저장해둔 BookDto 에 업데이트합니다
		// 도서제목 입력
		System.out.printf("도서제목을 입력하세요. 수정하지 않으려면 엔터를 누르세요 : ");
		String subject = sc.nextLine();
		if( !subject.equals("") ) bdto.setSubject(subject);
		
		// 출판년도
		System.out.printf("출판년도를 입력하세요. 수정하지 않으려면 엔터를 누르세요 : ");
		String makeyear = sc.nextLine();
		if( !makeyear.equals("") ) bdto.setMakeyear( Integer.parseInt(makeyear));
		
		// 입고가격
		System.out.printf("입고가격을 입력하세요. 수정하지 않으려면 엔터를 누르세요 : ");
		String inprice = sc.nextLine();
		if( !inprice.equals("") ) bdto.setInprice( Integer.parseInt(inprice));
		
		// 출고가격
		System.out.printf("입고가격을 입력하세요. 수정하지 않으려면 엔터를 누르세요 : ");
		String rentprice = sc.nextLine();
		if( !rentprice.equals("") ) bdto.setRentprice( Integer.parseInt(rentprice));
		
		// 등급 입력
		System.out.printf("등급을 입력하세요. 수정하지 않으려면 엔터를 누르세요 : ");
		String grade = sc.nextLine();
		if( !grade.equals("") ) bdto.setGrade(grade);
		
		
		// Dao 에   BookDto 를 보내서 해당 레코드를 수정
		int result = bdao.update( bdto );
		if( result == 1 ) System.out.println(" 레코드 수정 성공 ");
		else System.out.println(" 레코드 수정 실패 ");
	}
	
	private static void select(Scanner sc, Book_Dao bdao) {
		
		System.out.println("도서번호\t출판년도\t입고가격\t출고가격\t등급\t제목");
		System.out.println("---------------------------------------------------------------------------");
		
		ArrayList<Book_Dto> BookDto_list = bdao.select();
		for( Book_Dto bdto : BookDto_list) {
			System.out.printf("%d\t\t%d\t\t%d\t%d\t\t%s\t%s\n", bdto.getNum(),
					bdto.getMakeyear(), bdto.getInprice(), bdto.getRentprice(),
					bdto.getGrade(), bdto.getSubject() );
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	
	private static void insert(Scanner sc, Book_Dao bdao) {
		
		//Scanner sc = new Scanner(System.in);
		//Book_Dao bdao = new Book_Dao();
		
		System.out.print("제목을 입력하세요");
		String subject = sc.nextLine();
		System.out.print("출판년도를 입력하세요");
		int makeyear = Integer.parseInt( sc.nextLine() );
		System.out.print("입고가격을 입력하세요");
		int inprice = Integer.parseInt( sc.nextLine() );
		System.out.print("대여가격을 입력하세요");
		int rentprice = Integer.parseInt( sc.nextLine() );
		System.out.print("등급을 입력하세요");
		String grade = sc.nextLine();
		Book_Dto bdto = new Book_Dto();
		bdto.setSubject(subject);
		bdto.setMakeyear(makeyear);
		bdto.setInprice(inprice);
		bdto.setRentprice(rentprice);
		bdto.setGrade(grade);
		int result = bdao.insert( bdto );
		if(result==1)System.out.println("레코드 추가 성공");
		else System.out.println("레코드 추가 실패");
	}
}