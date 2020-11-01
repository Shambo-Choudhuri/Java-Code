package com.java.practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reading Input from User
		Scanner s=new Scanner(System.in);
		
		String inputByUser=s.nextLine();
		
		//Closing the Input Stream
		
		s.close();
		
		//Converting the String Object to Character Array
		
		char[] strArray=inputByUser.toCharArray();
		
		System.out.println("Input By User = " +inputByUser);
		
		
		String reverseString="";
		
		
		
		for(int i=strArray.length;i>=1;i--)
		{
			reverseString =reverseString+strArray[i];
			
		}
		
		System.out.println("Reverse Input= " +reverseString);
		
		
		if(inputByUser.equals(reverseString))
		{
			System.out.println("The String is Palindrome");
		}
		
		else
		{
			System.out.println("The String is not Palindrome");
		}
		
		
		
		

	}

}
