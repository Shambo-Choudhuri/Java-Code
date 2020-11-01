package com.java.practice;

import java.util.Scanner;

public class SwapAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		
		int a=s.nextInt();
		
		System.out.println("Enter the Second Number");
		
		int b=s.nextInt();
		
		System.out.println("Before Swap");
		
		System.out.println("a = " +a);
		
		System.out.println("b = " +b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("After Swap");
		
		System.out.println("a = " +a);
		
		System.out.println("b = " +b);
		
		
		
		

	}

}
