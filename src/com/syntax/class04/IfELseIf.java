package com.syntax.class04;

public class IfELseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///// when there is multipule conditions 
		
		////nested if when there is one condition that depends on another condition 
		///if{}, else if{}, else{}
		int num1=20;
		int num2=67;
		
		if(num1>num2) {
			System.out.println(num1+" is the larger than"+num2);
		} else {
			System.out.println(num2+" is the larger than"+num1);
		}
		
		

		int num3=10;
		int num4=10;
		
		if(num3>num4) {
			System.out.println(num3+" is the larger than"+num4);
		} else if (num3==num4) {
			
			System.out.println(num3+ "is equal to"+num4);
		
		} else {
			System.out.println(num4+" is the larger than"+num3);
			
		}	
		
		int day=2;
		
		if (day==1) {System.out.println("Monday");
		}else if (day==2) {System.out.println("Tuesday");
		
		}else if (day==3) {System.out.println("Wednesday");
		
		}else if (day==4) {System.out.println("Thursday");
		
		}else if (day==5) {System.out.println("Friday");
		
		}else if (day==6) {System.out.println("Saturday");
		
		}else if (day==7) {System.out.println("Sunday");}
			
		
		
		int month=4;
		
		if (month==1) {System.out.println("January");
		} else if (month==2 ) { System.out.println("February");
			
		} else if (month==3 ) { System.out.println("March");
		
		} else if (month==4 ) { System.out.println("April");
		
		}
		
		
	}

}
