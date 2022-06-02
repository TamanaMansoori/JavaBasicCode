package com.syntax.arraysClass10;

public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] disney= {"Shrek","Elsa","Goofy","Mulan"};
		
		int size=disney.length;
		
		System.out.println(size);//////4
		
		System.out.println(disney[1]);////Elsa
		
		///System.out.println(disney[4]);// we get error 
		
		System.out.println("------------------------------");
		
		///how to get all elements?? using forloop because we know how many elements we have and we have 4.
		for (int i=0; i<disney.length; i++) {
			System.out.println(disney[i]);
		}
		
		System.out.println("------------------------------");
		
		for (String character:disney) {
			
			if(character.equalsIgnoreCase("Mulan")) {
				System.out.println(character+ "is my favorite character");
			}else {
				System.out.println(character+ " ");
				
			}
			
		}System.out.println("------------------------------");
		
		//create an array to store double values and then print all elements using different loops 
		
		double [] num= {2.99,3.99, 4.99, 5};
		for (double x:num) {
			System.out.println(x+ " ");
		}
		
		System.out.println("--------OTHER WAY------------");
		
		System.out.println();
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]+ " ");
		}
		
		System.out.println("------------------------------");
	///////create an array on integer and calculate the sum of all element in a array 
		
		int []numbers = {1,2,3,4,5};
		
		int sum=0;
		for (int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println("sum of all elements ="+sum);
		

	}

}
