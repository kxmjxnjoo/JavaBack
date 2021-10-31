package days03;

import java.util.Scanner;

public class Varialble07 {

	public static void main(String[] args) {
		// (입력)사과 갯수 입력, 한 상자에 담길 사과의 갯수 입력(입력)
		// (출력)입력조건으로 포장했을 때, 포장된 포장 갯수, 남은 사과 수 출력
		Scanner sc = new Scanner(System.in);
		
		int apple;
		System.out.print("사과의 갯수를 입력하세요: ");
		apple = sc.nextInt(); //입력
		
		int boxInQuan;
		System.out.print("한 상자의 포장될 사과의 갯수를 입력하세요: ");
		boxInQuan = sc.nextInt();
		
		int boxQuan = apple / boxInQuan;
		int theRest = apple % boxInQuan; //계산
		
		System.out.println("포장된 사과박스가 : " + boxQuan);
		System.out.println("남은 사과의 갯수 : " + theRest); //출력
		
		
	}
}