package days16;

import java.util.Vector;
// 상품과 구매자를 클래스로 만들고 구매, 환불 등의 동작을 메소드로 제작
class Product {
	int price;
	int bonusPoint;
	Product(int p) {
		this.price = p;
		this.bonusPoint = p/10;
	}
}
class Computer extends Product{
	Computer() {
		super(150);
	}
	public String toString() {
		return "Computer";
	}
}
class Tv extends Product{
	Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Audio extends Product {
	Audio() {
		super(60);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // 구매목록
	// 벡터란 배열의 확장형 리스트 구조. 객체들을 저장할 수 있는 배열
	// 사용자가 만든 클래스의 객체(메모리를 할당 받은 레퍼런스값) 등이
	// 저장되는 다형성 객체 저장 리스트
	//Computer c = new Computer();
	// item.add(c);
	// public void buy(Tv t) {}
	// public void buy(Computer c) {}
	// public void buy(Audio a) 	{}
	public void buy(Product p) {
		// 전달된 제품을 구매할 정도의 잔액이 있는가 확인
		if(this.money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		} 
		// 제품을 구매하는 코드. 잔액을 제품 가격만큼 차감, 제품을 itemp에 추가
		this.money -= p.price;
		// 제품의 bonusPoint를 Buyer의 bonusPoint에 가산
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입 하셨습니다");
		// 자식 인스턴스를 저장하고 있는 부모 레퍼런스가 상속되고 오버라이딩된
		// 메소드를 실행하면 자식에서 오버라이딩된 메소드가 우선 실행됨
		
		item.add(p);
		// Vector 클래스의 멤버 메소드인 add의 생김새 public void add(Object obj) {}
	}
	public void summary() {
		int sum = 0; // 지출 총액 변수
		String itemList = ""; // 구매목록 변수
		if(item.isEmpty()) {
			// item.isEmpty() : Vector 객체인 item이 비어있으면 true리턴
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		for(int i=0; i<item.size(); i++) {
			// item.size() : 저장된 요소의 개수 리턴
			Product p = (Product) item.get(i);
			sum += p.price; // 구입금액 합산
			itemList = itemList + " " + p;
		}
		System.out.println("지출 총액: " + sum + ", 구매목록: " + itemList);
	}
	public void refund(Product p) {
		// item.remove(p) : item에서 p를 삭제
		// 잘 지워졌다면 true를 리턴
		if(item.remove(p)) {
			// Buyer 잔액에 상품가격합산
			money += p.price;
			// 보너스 포인트 차감
			bonusPoint -= p.bonusPoint;
			// 환불 상품 안내
			System.out.println(p + "를 반품 하셨습니다");
		} else {
			System.out.println("구입하신 물품 중에 해당하는 제품이 없습니다");
		}
	}
}
public class Extends09_Object05 {

	public static void main(String[] args) {
		 Tv t = new Tv();
		 Computer c = new Computer();
		 Audio a = new Audio();
		 System.out.println(t);
		 System.out.println(c);
		 System.out.println(a);
		 System.out.println();
		 
		 Buyer b = new Buyer();
		 b.buy(c);	b.buy(a);	b.buy(t);

		 b.summary();
		 b.refund(c);
		 b.summary();
	}
}