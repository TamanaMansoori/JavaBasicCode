package com.syntax.class08;
public class ForLoop{
	
	public static void main(String [] args) {
		
		///// write good morning 5 times
		
		for(int i=1; i<=5; i++) {
			System.out.println("Good morning");
		}
		
	
	////// here we get infinite print outs because it is decremented and we get all - numbers which are less than 1
			for(int i=1; i<=5; i--) {
				System.out.println("Hello");////// infinite 
			}
			
		
		///// since condition is false 1>5 which is false so we get nothing in our printout.
		for(int i=1; i>=5; i++) {
			System.out.println("How are you ");
		}
		
		
		
	}
	
	
	
}