package STUDY;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import jdbc04.MemberDao;
import jdbc04.MemberDto;


public class ProductDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		while(true) {
			System.out.println("--- 메뉴 선택 ---");
			System.out.printf("1.데이터열람  ");    		System.out.printf("2.데이터추가  ");
			System.out.printf("3.데이터수정  ");		System.out.printf("4.데이터삭제  ");
			System.out.println("5.프로그램 종료  ");	System.out.print(">>메뉴 선택: ");			
			String choice = sc.nextLine();
			if( choice.equals("5")) break;
			switch( choice ) {
				case "1": 
					select(sc); break;
				case "2": 
					insert(sc); break;
				case "3": 
					update(sc); break;
				case "4":
					delete(sc);  break;
				default : System.out.println("메뉴 선택이 잘못되었습니다");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}



	private static void delete(Scanner sc) {
		ProductDao pdao = ProductDao.getInstance();
		ProductDto pdto = null;
		int num;
		String input;
		while(true) {
			System.out.printf("삭제할 제품번호를 입력하세요: ");
			input = sc.nextLine();
			if( input.equals("") ) System.out.println("제품번호 입력은 필수 입니다");
			else break;
		}
		num = Integer.parseInt( input );
		//회원번호 조회 - 조회된 회원이 없으면, 회원이 없습니다 출력후 종료 - 조회된 회원이 있으면 삭제후 종료
		pdto = pdao.getNum(num);
		if( pdto==null) {
			System.out.println("해당 제품이 없습니다");
		}else {
			int result = pdao.delete(num);
			if( result == 1 ) System.out.println(" 레코드 삭제 성공 ");
			else System.out.println(" 레코드 삭제 실패 ");		
			return;
		}
}


	private static void update(Scanner sc) {
		ProductDao pdao = ProductDao.getInstance();
		ProductDto pdto = null;
		
		String input;
		while(true) {
			System.out.printf("수정할 제품명을 입력하세요: ");
			input = sc.nextLine();
			if( input.equals("") ) System.out.println("제품명은 필수 입니다");
			else break;
		}
		String name = sc.nextLine();
		if( pdto==null) {
			System.out.println("해당 제품이 없습니다");
			return;
		}
		//이름입력 후  빈칸이 아니라면 mdto 에 저장
		System.out.printf("입고가를 수정하려면 입력하세요: ", pdto.getInpri());
		System.out.printf("수정하지 않으려면 엔터만 입력하세요 -> ");
		int inpri = Integer.parseInt( sc.nextLine() );
		if( !name.equals("") ) pdto.setInpri(inpri);
		
		//전화번호 입력 후  빈칸이 아니라면 mdto 에 저장
		System.out.printf("출고가를 수정하려면 입력하세요: ", pdto.getSellpri());
		System.out.printf("수정하지 않으려면 엔터만 입력하세요 -> ");
		int sellpri = Integer.parseInt( sc.nextLine() );
		if( !name.equals("") ) pdto.setSellpri(sellpri);
		

		
		
		//회원가입일 수정 - 가입일자 후  빈칸이 아니라면 mdto 에 저장
		System.out.printf("수정할 제작년도를 입력하세요: ", pdto.getMakeyear());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d = null;
		while(true) {
			try {
				String b = sc.nextLine();  // String 으로 날짜입력
				if(b.equals("")) break;  // 엔터만 입력했으면 반복 멈춤
				d = sdf.parse( b );  // java.util.Date 로 변환
				break;
			} catch (ParseException e) {
				System.out.print("날짜를 입력예로 맞춰 다시 입력하세요(입력예:2015-12-31)");
			} 		
		}
		if( d != null ) {
			java.sql.Date makeyear = new java.sql.Date( d.getTime() );  // java.sql.Date 로번환
			pdto.setMakeyear(makeyear);
		}
		
		int result =  pdao.update( pdto );
		if( result == 1) System.out.println("레코드 수정 성공");
		else System.out.println("레코드 수정 실패");		
		
	}



	private static void insert(Scanner sc) {
		ProductDao pdao = ProductDao.getInstance();
		ProductDto pdto = new ProductDto();
			
		System.out.printf("제품 이름을 입력하세요: ");
		pdto.setName(sc.nextLine());

		System.out.print("입고가를 입력하세요: ");
		pdto.setInpri( Integer.parseInt( sc.nextLine() ));
		
		System.out.print("판매가를 입력하세요: ");
		pdto.setSellpri( Integer.parseInt( sc.nextLine() ));
		
		System.out.printf("제품의 제작년도를 입력하세요(YYYY-MM-DD): ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d = null;
		while(true) {
			try {
				d = sdf.parse( sc.nextLine() );
				break;
			} catch (ParseException e) {
				System.out.print("날짜를 예시에 맞춰 다시 입력하세요(입력예:2015-12-31): ");		
			} 		
		}
		//java.util.Date 을  java.sql.Date 로 변환 
		java.sql.Date makeyear = new java.sql.Date( d.getTime() );
		//dto 에 입력
		pdto.setMakeyear(makeyear);
		
		Calendar c = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		c.setTime( d );   //c.setTime( birth );  Date 자료를 Calendar  자료로 변환
		int make = today.get( Calendar.YEAR ) - c.get( Calendar.YEAR ) + 1;
		pdto.setMakeyear(makeyear);
		int result = pdao.insert( pdto );
		if( result == 1) System.out.println("레코드 추가 성공");
		else System.out.println("레코드 추가 실패");
	}

	private static void select(Scanner sc) {
		ProductDao pdao = ProductDao.getInstance();
		ArrayList<ProductDto> list = pdao.select(); 
		
		System.out.println("숫자\t제품종류\t\t제작년도\t\t매입가\t\t출고가");
		System.out.println("---------------------------------------------------------------");
		for(ProductDto pto : list)
			System.out.printf("%3d\t%s\t\t%s\t\t%d\t%d\n", pto.getNum(),
					pto.getName(), pto.getMakeyear(), pto.getInpri(), 
					pto.getSellpri() );			
	}
}