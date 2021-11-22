package days09;

import java.util.Random;

public class Array06 {

	public static void main(String[] args) {
		int[] a = new int[6];
		Random rd = new Random();
		a[0] = rd.nextInt();
		if(a[0] <= 0) a[0]*=-1; // 만약 음수가 나오면 양수로 만듬
		a[0] = a[0] % 45 +1; // (나누기 45)+1 을 하면 45->내가 입력한 숫자까지 나오게 할 수 있음 
		// 로또 번호 6개 반복실행문으로 발생해서 저장합니다
		int j;
		for(int n=1; n<=5; n++ ) {
			for(int i=0; i<a.length; i++) {
				a[i] = rd.nextInt();
				if(a[i] <= 0) a[i]*=-1;
				a[i] = a[i] % 45 +1; 
			
			for(j=0; j<i; j++) 
				if(a[i]==a[j]) break;
			if( i != j ) i--;
			
		}
			// 정렬합니다
			System.out.println();
			for(int i=0; i<a.length; i++) {
				for( j=i; j<a.length; j++) {
					if( a[i] > a[j]) {
						// a[i]와 a[j]의 값을 바꿉니다
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
				}
			}
		}
			// 출력합니다
			for(int i =0; i<a.length; i++) System.out.printf("%d\t", a[i]);
		}	
		
	}
}
