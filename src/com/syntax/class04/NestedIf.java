package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// if statement inside another if  or we call it inner if 
		
		
		boolean vaccine=true;
		int dose=1;
		if (vaccine) {
			System.out.println("Let me check if you got a second dose");
			if (dose==1) {
				System.out.println("you need 1 more dose");
				
				
			} else {
				System.out.println("you are fully vaccinated");
			}
		}
		
		
		        // *if we change the value to false then we don't get any outcome.
				// if we change the value to dose2 then we get the (you are fully vaccinated)
				// if we change the condition of vaccine to false then we get nothing outcome.
	
		String month="May";	
		int day=8;
		
		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");
			
			if (day==8) {
				System.out.println("Today is the Mother's day");
			}
				
		} else if (month.equals("June")) {
			if (day==19) {
			System.out.println("Today is the Father's day");
		}	
	}

	String month1="June";
	int day2=15;
	int day3=20;
	
	if (month1.equals("June")){
		System.out.println("Let me check what is today's date");
		
		if (day2==15) {
			System.out.println("It is Tamana's birthday");
		}
	} else if (day3==20)
	{
			System.out.println("It is not Tamana's birthday");
		}
	
	/// if we change the month to July then we get (it is not Tamana's birthday)
	
	
	boolean diploma=true;
	double gpa=3.5;

	
	if (diploma) {
		System.out.println("Congratulation");
			if (gpa>=3.5); {
				System.out.println("You are eligibale for scholarship");
			
				}
		}else {
			System.out.println("You should have studied hard");
	}
	
	//// if we change the boolean to false then we get (you should have studied hard)
	
	
	int age=15;
	int weight=100;
	
	if (age>=18) {
	System.out.println("Your are eligible to donate but we need to check your weight");
	
	} if(weight>=110) {
		
		System.out.println("You are eligible to donate blood");
	}else {
		System.out.println("You are not eligible to donate");
	}

	
	int num1=80;
	int num2=200;
	int num3=500;
	
	if (num1>=num2) {
		System.out.println(num1+ "is the largest number" );
	}else  {
		System.out.println(num2+ "is the largest number" );
	} 
	if (num2>=num3) {
		System.out.println(num2+" is the largest number");
	}else {
		System.out.println( num3+" is the largest number");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
		
		
		
		
		
		
		

}