package com.syntax.class05;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///inside one condition we check another condition
		///logical operators:
		/// (and &&) both condition should be true then we get the true otherwise we get false
		///Or || it gives us true if there is only one true in the condition otherwise we get false
		//NOT ! (reverse the condition )
		
		//// to test 1 or more conditions in 1 statement 
		
		
		/////Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		////short (under 60 inch)
		/////medium(between 60 -72 inch)
		////tall (over 72 inch)
		////////////////
		///Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		////Ask user to enter a number and then define if number is small, medium or large
		////Small number is value between 1 and 10
		////Medium number is value between 11 and 100
		///Large number is value between 101 and 1000
		
		
		int num=90;
		
		if (num==60) {
			System.out.println("The person is short");
			
		}else if (num>60 && num==70) {
			System.out.println("Ther person is mediul");
		}else if (num>80 && num>75) {
			System.out.println("The peson is long");
			
		}
		
		System.out.println("------------------------");
		
		
		boolean job=true;
		double salary=100000;
		
		if (job && salary>=100000) {
			System.out.println("I am super happy");
		}
	System.out.println("-------------------------");	
	
		boolean study=false;
		boolean homeWork=true;
		boolean practice=true;
		
		if (study && homeWork && practice) {
		System.out.println("You will succesed in the course");
	}else {
		System.out.println("You will struggle ");
	}
	}	
	}
