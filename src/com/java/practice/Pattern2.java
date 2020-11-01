package com.java.practice;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Row Number");
		
		int rowNumber=s.nextInt();
		
		//System.out.println("Enter Column Number");
		
		//int columnNumber=s.nextInt();
		
		for(int i=1;i<=rowNumber;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("");
				
			}
			
			System.out.println();
		}
		
		

	}

}
