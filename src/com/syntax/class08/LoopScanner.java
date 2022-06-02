package com.syntax.class08;
import java.util.Scanner;

public class LoopScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		
		
		int secreatNum=301;
		int guessedNum=scan.nextInt();
		
		do {
			System.out.println("What is the secreat number?");
		
		}while (secreatNum!=guessedNum);
		
		
		System.out.println("You are right");
	}
	}

