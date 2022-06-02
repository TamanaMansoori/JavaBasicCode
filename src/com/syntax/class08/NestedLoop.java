package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<=3; i++) {                         ///////////////outer loop, it controls inner loop
			System.out.println("Hello");
			
			for (int y=1; y<=2; y++) {                      ////////////////nested loop
				System.out.println("Bye");
			}
		}
		
		
		System.out.println("-----------------------");
		////////////////////////////////////////
		
		
		for (int i=1; i<=3; i++) {                         
			System.out.println(i);
			
			for (int y=1; y<=2; y++) {                      
				System.out.println(y);
			}
		}
		
		System.out.println("-----------------------");
		////////////////////////////////////////
		
		
		for (int i=1; i<=3; i++) {                         
			
			for (int y=1; y<=2; y++) {                      
				System.out.println(i+" " +y);
			}
		}
		
		System.out.println("-----------------------");
		////////////////////////////////////////
		
		
		for (int i=1; i<=3; i++) {                         
			
			System.out.println("Hello");
			
			for (int y=1; y>=2; y++) {    ///////we change relational operator yo (>)   since the condition is false 
				                              ////////// so the syso bye will not be executed 
				
				System.out.println("Bye");
			}
		}
		System.out.println("-----------------------");
		////////////////////////////////////////
		
		
		for (int i=1; i>=3; i--) {           ///// since the outer condition is false so we get nothing to execute              
			
			System.out.println("Hello");
			
			for (int y=1; y<=2; y++) {                      
				System.out.println("Bye");
			}
		}
		
	}

}
