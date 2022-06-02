package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean boo=true;
		System.out.println(boo);
		
		//// if we put =! the value will change to false , it reverse the value from true to false and false to true
		
		boolean traffic=true;
		
		if (traffic) { //////////(!traffic) it means if there is no traffic 
			System.out.println("I will reach work on time");
		}
		
		String name="Emre";
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}
		
		
	}

}
