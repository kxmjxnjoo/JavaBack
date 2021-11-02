package days12;
class Account{
	private double balance; // 계좌 정보 클래스에 잔액이 저장된 멤버변수

	public void initBanance(int i) {
		balance = i;
	}
	public void display() {
		System.out.printf("현재 잔액은 %.2f 원 입니다.\n", balance);
	} // 잔고 확인 기능
	public void withraw(int money) {
		balance -= money;
	} // 출금 기능능
	public void deposit(int money) {
		balance += money;
	} // 입금 기능
}

public class Class05 {

	public static void main(String[] args) {
		Account a = new Account();
		a.initBanance(100000);
		a.display();
		a.withraw(5000);   a.display();// 출금
		a.deposit(20000);   a.display(); // 입금
	}
	
}
