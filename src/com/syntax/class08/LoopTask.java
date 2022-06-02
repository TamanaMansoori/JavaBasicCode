package com.syntax.class08;

public class LoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for (int i=1; i<6; i++) {
			
			sum+=i;///value of sum is 0 and we add it to 1
				
		}
		
		System.out.println(sum);
		
	
		
		int sum1=0;
		for (int a=1; a<=70; a++) {
			if (sum1%2 ==0) {
			sum+=a;
		}
		}
		System.out.println(sum);
		
	///////////////
		
		int odd=0;
		for (int b=1; b<=70; b++) {
			odd-=b;
		}
		
		System.out.println(odd);
		
		//////// another way 
		
		int sumEven=0;
		int sumOdd=0;

		for (int i = 1; i <= 70; i++) {

		if (i % 2 == 0) {
		sumEven+=i;
		}else {
		sumOdd+=i;
		}
		}

		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
		
		
	
		
		
		
	}

}
