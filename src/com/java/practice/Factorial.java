package com.java.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int number=s.nextInt();
		
		int factorial=1;
		
		for(int i=0;i<number;i++)
		{
			factorial=factorial*(number-i);
		}
		
		System.out.println("The factorial of the number is " +factorial);
		

	}

}
