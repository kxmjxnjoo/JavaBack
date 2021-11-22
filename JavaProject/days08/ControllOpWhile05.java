package days08;

import java.util.Random;

public class ControllOpWhile05 {

	public static void main(String[] args) {
		
		// 랜덤한 숫자(난수)를 얻기 위해서는 랜던한 숫자를 방해해주는 도구 필요
		Random rd = new Random();
		
		// Scanner sc 이용하여 자료 입력받듯이 Random rd 이용하여 난수를 제공받음 
		int i = 0;
		while(i<10) {
		int num = rd.nextInt();
		//System.out.println(num);
		if(num < 0) num = num * -1;
		// System.out.println(num); 랜덤한 음수가 나왔을 때 양수로 바꿔주는 계산
		num = num&10;
		System.out.printf("%d ", num);
		i++;
		}
	}
}
