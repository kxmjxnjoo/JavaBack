package days09;

public class Array05 {

	public static void main(String[] args) {
		// 배열에 있는 값들 중 최대값과 최소값을 찾아서 출력하세요
		int[] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		
		int max = a[0]; 
		// 지금까지 나왔던 숫자 중 가장 큰 값을 저장해둘 변수 max의 초기값으로 
		// 배열a의 0번 인덱스를 값으로 넣고 for에서 1번 인덱스 부터 반복하게하라 
		// 그러면 숫자를 임의로 정하지 않아도 a배열 내에서 확인하게 된다
		for(int i=1; i<a.length; i++) {
			if(max<a[i]) 
				max = a[i];
		}
		System.out.println("최대값: " + max);
	
		int min = a[0];
		for(int i =1; i<a.length; i++) {
			if( min > a[i])
				min = a[i];
		}
		System.out.println("최소값: " + min);
		
		// 배열의 값들을 오름차순 또는 내림차순으로 재배치(정렬)
		// 이중 반복문이 사용되며, 첫번째 반복문의 첨자 i 두번째 반복문 첨자 j 
		// i=0일때 j는 1~9로 반복시켜서 a[i]와 a[j] 둘을 비교하고
		// a[j] 값이 더 작으면 a[i]와 a[j]의 값을 오름차순에 맞게 맞바꿉니다
		// 그 동작을 j가 끝까지 갈 때 까지 반복하면 a[i]에는 배열 중 가장 작은 값이 저장됨
		
		int k = 20, b = 30; 
		// k = b;
		// b = k;		
		// 변수끼리 값을 바꿀 때 위와 같이 하면X
		int temp;  // k값에 b를 저장하기 전에 k의 값을 저장해줄 여분 변수선언
		temp = k;
		k = b; 
		b = temp; // 저장해놨던 k의 값을 b에 넣어줌
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if( a[i] > a[j]) {
					// a[i]와 a[j]의 값을 바꿉니다
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i =0; i<a.length; i++) System.out.printf("%d ", a[i]);
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				if( a[i] < a[j]) {
					// a[i]와 a[j]의 값을 바꿉니다
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
			}
		}
	}
		for(int i =0; i<a.length; i++) System.out.printf("%d ", a[i]);
			
	
	}
}
