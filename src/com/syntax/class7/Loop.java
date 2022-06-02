package com.syntax.class7;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=1;
		do {
			System.out.println(num+ " ");
			num++;
		}while (num>=30);
	
		
		
		int num2=70;
		do {
			System.out.print(num2+ " ");
			num2-=2;
		} while (num2>=30);
		
		
		System.out.println(num2);
		////////////////////////////////
		
		Scanner scan=new Scanner (System.in);
		String job; 
		do{ 
			System.out.println("Did you get a job");
		job=scan.nextLine();
		
		}while (!job.equalsIgnoreCase("yes"));
		
		System.out.println("congratulastion");
		
	
}
}