package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//break we use it inside the switch , break where java stopes or braks the block of code 
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hellow");
			
			break; //////the code execude only once 
		}
		
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hellow");
			
			break; //////the code execude only once 
		}
		
		//////////////////////////////
		
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hellow");
			if (i==2) {
			
			break; 
		}
		
		}
		////////////////////////////////////////////////
		
		boolean summer=true;
		int temp=95;
		while (summer) {
			if (temp<70) {
				System.out.println("It is not hot anymore");
				break;
			}
			System.out.println("It is hot");
			temp-=10;
		}
		
		
		
		
	}

}
