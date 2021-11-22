package days01;
// 컴파일러는 주석문을 제외한 다른 명령어들만 컴파일함

// // : 한 줄 주석
// /* ~~여러줄~~*/ : 여러 줄에 걸쳐 사용되는 주석

public class JavaFirst {
	// 자바프로그래밍은 클래스 단위로 구성되고 실행되고 위는 구성의 경계를 생성한 예

	public static void main(String[] args) {
	// 구성은 class단위지만 프로그램의 시작과 끝은 main 영역에서 담당
	// class 안에는 main외에 다른 구성요소들이 들어올 수 있음
	// JavaFirst 클래스의 내용이 실행이 된다면 위의 main의 내용이 실행
	System.out.printf("겁나 쉬운 자바 프로그래밍~!\n");
	// System.out.printf(); -> 괄호 안 큰따옴표의 문자들을 화면에 그대로 출력하는 명령어
	// 자바프로그램은 하나의 명령어가 끝날 때 마다 ';'을 표시하여 문장(명령)의 끝을 표시합니다.
	// "겁나 쉬운 자바 프로그래밍~!"을 화면에 세번 출력하고 싶다면 명령을 추가하면 됨
	System.out.printf("겁나 쉬운 자바 프로그래밍~!\n");
	System.out.printf("겁나 쉬운 자바 프로그래밍~!\n겁나 쉬운 자바 프로그래밍~!");
	// 별도의 표시없이 ~printf를 명령하면 명령수와 상관없이 모두 한 줄에 출력함
	// 줄 바꿈 표시 '\n'
	}
	// 클래스 이름 생성 규칙
	// 첫 글자 반드시 대문자로
	// 여러 단어가 조합된 경우 두번째 단어의 첫 글자 대문자로 작성
	// 클래스 이름은 그를 저장하고 있는 파일 이름과 반드시 일치해야 함
	// 파일에 저장된 클래스는 여러개일 수 있고 그들 중 하나는 반드시 public으로 선언해야 한다.
}