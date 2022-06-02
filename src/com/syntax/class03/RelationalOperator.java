package com.syntax.class03;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20;
		int num2=22;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1!=num2);
		
		/// what is the difference between these two?
		System.out.println(num1==num2);// (==)it shows equality
		System.out.println(num1=num2);// (=) it shows reassigning 
		
		System.out.println(num1==num2);
	//--------------------------------------------------
		
		
		boolean result=100>200;// we use boolean because it is a relational operator 
		System.out.println(result);
		
		int result1=100+200;/// we use int because it is arthimetic operation 
		System.out.println(result1);
		
		String result2="Emer"+10;/// when there is a string then + is a concotination 
		System.out.println(result2);
		
		int num3=10;
		int num4=11;
		result=num3==num4;/// it is relational operator because of the ==
		System.out.println(result);
		
		result=num3!=num4;
		System.out.println(result);
		
		////relational operators are used mostly in if statement or condational statement 
		
		
	}

}
