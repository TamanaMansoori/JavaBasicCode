package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

		
		///// skips current execution or repetation , it is used inside some specific conditions 
		
		//// when java execute continue it gose back to the beginnin of the loop so rest of the code inside  loop body will be ignored
		
		for (int i=1; i<=5; i++) {
		
			if ( i==2) {
				continue;
				
		}
			System.out.println(i+" ");
			
		}
		//////////////////////////////// print numbers from 1 to 10 except 5 and 7
		
		for (int i=1; i<=10; i++) {
			if (i==5 || i==7) {
				continue; /////except 
				
			}
			System.out.print( i+  " ");
		}
		
		
		
		/////////////////// task
		boolean yes=true;
		
		do {
			System.out.println("Apply for creadit card");
			if (yes)
			break
		}
		

		
		
		/// print 1 to 50 except those divisible by 3
		
		for (int a=1; a<=50; a++) {
			
			if (a)
				continue;
		}
		
		
		
	}

}
