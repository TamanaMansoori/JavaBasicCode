package com.syntax.class09;

public class arrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] price=new double[6];
		
		//// if we don't write the zero and would like to executed in the printout then array with show becouse the array always
		///starts from 0 
		price[1]=2.99;
		price[2]=3.99;
		price[3]=4.99;
		
		System.out.println(price[0]);
		
		
		System.out.println("-------------ANOTHER WAY-----------");
		
		
		String[] fruits= {"mango", "Apple", "Kiwi", "pear"};//// mango is 0 so apple is 1 and kiwi is 3 becouse arrya starts from 0
		
		System.out.println(fruits[2]);
		
		//////fruits[4]="peach";//// here we get error because we fixed the size above and put the values there .
		
		System.out.println("My fav fruit is "+fruits[0]);
		
		// i want to find the size of an array/how many elements?
		
		int size=fruits.length;
		System.out.println(size);///// here we showed the number of 
		
		System.out.println("---------------------------------------");
		
		
		
		char grade[]=new char [6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[4]);
		
		/// second way ///
		
		String [] gradeSecond= {"A","B","C","D","E","F"};
		System.out.println(gradeSecond[2]);
		
		
		System.out.println("---------------------------------------");
		
		
		// to acces all element we use loop since we know how many iteration so we use loop for.
		for (int i=0; i<grade.length; i++) {
			System.out.println(grade[i]);
			/////////////System.out.print(grade[i]+" ");///A B C D E F 
		}
		
		
		
		
		
		

	}

}
