package com.syntax.class09;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////Array is the container that can store multipule values 
		
		int [] b=new int[4];
		
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		System.out.println(b[2]);/////70
		
		System.out.println(b[1]+b[3]);/////////185
		
		System.out.println("-----------------------");
		
		String[] classMates=new String[5];
		
		classMates[0]="Khrystina";/// always starts with zero 
		classMates[1]="Zameer";
		classMates[2]="Tara";
		classMates[3]="Tamana";
		classMates[4]="Adem";
		
		System.out.println("My classmates name is "+classMates[1]);
		
		
		System.out.println("-----------------------");
		
		
	}

}
