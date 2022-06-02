package com.syntax.class04;

import java.util.Scanner;
class Main {
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Is it sunny outside?");
  boolean sunny=scan.nextBoolean();
  int temp=scan.nextInt();
  if(sunny=true){
    }System.out.println("It is a sunny day, I should go somewhere!");
  System.out.println("What is the temperature outside?");
  
   if (temp>85){
    System.out.println("I am going to the beach!");
  }else if (temp<85){
    System.out.println("I am going to the park");
  }else {
    System.out.println("I stay at home and practice Java!");
   
  }
  
  }
  }