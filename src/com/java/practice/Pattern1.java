package com.java.practice;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Row Number");
		
		int rowNumber=s.nextInt();
		
		System.out.println("Enter Column Number");
		
		int columnNumber=s.nextInt();
		
		for(int i=1;i<=rowNumber;i++)
		{
			for(int c=1;c<=columnNumber;c++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println("");
		}

	}

}
