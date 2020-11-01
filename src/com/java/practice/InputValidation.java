package com.java.practice;

import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int number;
		
		
		int count=0;
		
		do
		{
			System.out.println("The number may be valid or invalid");
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number:");
			number=s.nextInt();
			count++;
			if((number>=0 && number<=10) |  (number>=90 && number<=100))
			{
				System.out.println("The number entered is valid: " +number);
				break;
			}
			else
			{
				System.out.println("The number entered is invalid: " +number);
				break;
			}
		}while(count<=10);
		
		
		
		
		
		
		
		
			
		
		

	}

}
