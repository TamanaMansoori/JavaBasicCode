package com.syntax.class09;

public class classOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		///break is the one that breaks block of code, here when the specific condition is met we stop the iteration 
		////continue: keyword that skips current execution/iretation 
		
		for (int i=1; i<=5; i++) {
			
			//// if we put the key word (continue) /// here no execution 
			System.out.println("Hello");
			//// if we put the key word (break)//// only one time execution 
		}
		
		System.out.println("---------------------");
		
		for (int j=1; j<=5; j++) {  /// if we put the break above the SYSO the there won't be any execution. 
		
		System.out.println("Hi");
		
		break;
		
	}
		System.out.println("--------------------------------");
		for (int m=1; m<=5; m++) {  ///// if we put -- then here will be infinite Hi beause m<5 will be true for infinite numbers
			
			System.out.println("Hi");
			
		for (int y=1; y<=3; y++) {  ////////////// if y>3 then no bye will be executed because  the condition is not true
			System.out.println("Bye"); ///// if we put -- then here will be infinite bye because y<3 will be true for infinite numbers
		}
		
		}
		
		
		System.out.println("--------------------------------");
		
		for (int n=5; n<=5; n++);{
			System.out.println("Hello");
			for (int v=3; v<=3; v++) {
				System.out.println("bye");
				break;
							
		}
			
		}
		
		
		
		
	}
}
