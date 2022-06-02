package com.syntax.arraysClass10;

public class taskForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []array = {2,4,6,8};
		int max= array[0];
		
		for (int i=1; i<array.length; i++) {
			
			if (array [i]> max) {
				max=array[i];
				
			}
		}
		System.out.println("The largest number is "+ max);
		
		
		System.out.println("----------------------------");
		
		
		///create an array to store char value and then print those in reverse order
		
		char []values= {'a', 'b', 'c','d'};
		for (int i=values.length-1; i>=0; i--) {
			
			System.out.println(values[i]+ " ");
		}
		
		System.out.println("----------------------------");
		
		
		
	}

}
