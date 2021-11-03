package days13;
class Student{
	private int bunho;
	private String name;
	private int[] scores;
	private String[] subjects = {"국어", "영어", "수학"};
	private int tot;
	private double avg;
	private char grade;

	Student() {
		scores = new int[subjects.length];
	}
	Student(String n) {
		this();
		name = n;
	}
	Student (String n, int kor, int eng, int mat) {
		this(n);
		scores[0] = kor; scores[1] =eng; scores[2] = mat; 
	}
	void copy1(Student s) { // std1.copy(std3)
		this.bunho = s.bunho;
		this.name = s.name;
		for(int i=0; i<subjects.length; i++) 
			this.scores[i] = s.scores[i];
	}
	Student copy2() { //this <- std3
		Student t = new Student();
		t.bunho = this.bunho;
		t.name =  this.name;
		for(int i=0; i<subjects.length; i++) 
			 t.scores[i] = this.scores[i];
		return t; // std4 <- t
	}
	
}
// 디폴트 생성자에서 배열 저장소를 할당해주세요
// String 자료를 전달인수로 하는 생성자에서 전달된 이름을 멤버변수에 저장
// 디폴트 생성자, String 매개변수 생성자, String과 정수 세개가 있는 생성자들 사이에
// 필요한 형제 생성자를 this로 호출
// copy1과 copy2를 제작
public class Class17 {

	public static void main(String[] args) {
		Student std1 = new Student("홍길서", 88,99,66);
		Student std2 = new Student("홍길동", 98,87,89);
		Student std3 = new Student("홍길남", 100,100,100);
		std1.copy1(std3);
		Student std4 = std3.copy2();
		
	}

}
