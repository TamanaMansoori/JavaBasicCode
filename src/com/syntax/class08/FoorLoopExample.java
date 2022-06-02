package com.syntax.class08;

public class FoorLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///// we use loop only for integers 
		
		/// write numbers from 1 to 90
		
		for (int i=1; i<=90; i++) {
			
			System.out.print(i+" ");
		}
		
		/// number from 60 to 10
		
		for (int a=60; a>=10; a--) {
			System.out.print(a+ " ");
		}
		
		//// 
		for (int a=5; a<=40; a+=5) { /////5+5=10 then 10+5=15, then 15+5=20  ... we continue till 40 
			System.out.println(a+ " ");
		}
		
		
		for (int a=1; a<=20; a++) {  
			System.out.println(a+ " ");
		
		}
		
		for (int a=20; a<=50; a++) {  
			System.out.println(a+ " ");
		
		}

	}

}
