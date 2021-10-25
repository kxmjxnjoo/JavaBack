package Test;

import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int H = sc.nextInt();
		   int M = sc.nextInt();
		   
		   if(M < 45) {
			   H--;
			   M = 60-(45-M);
			   if(H < 0) {
				   H = 23;
			   }
			   System.out.println(H + " " + M);
		   } else {
			   System.out.println(H + " " + M);
		   }  //검색해서 찾은 답변
		   
		//   if(M<45) {
		//	   H--;
		//	   M = 60 - (45-M);
	
		//   System.out.println(H);
		//   System.out.println(M);
		                        
		//   } else if (M<=45) {
		//	   M = M-45;        
		                        
		//   System.out.println(H);
		//   System.out.println(M);
		// }
		   
		   
	}
}
