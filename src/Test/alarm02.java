package Test;

import java.util.Scanner;

public class alarm02 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
       if(M<45) {
    	   H--;
    	   M = 60+(M-45);
    	   System.out.println(H + " " + M);
       } else  if(H<=0) {  
    	   H = H+23;
    	   M = M-45;
    		System.out.println(H + " " + M);
       }

 		
 		System.out.println();


	}
}		