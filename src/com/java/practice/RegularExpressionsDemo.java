package com.java.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		//Create a pattern object
		
		Pattern p=Pattern.compile("ab");
		
		//Create a matcher object
		
		Matcher m=p.matcher("abbabbba");
		
		//Procedure to search for the required pattern in the target String
		
		while(m.find())
		{
			count++;
			
			System.out.println(m.start()+ "-------------"+m.end()+"----------"+m.group());
		}
		
		System.out.println("The total no of Occurences is : " +count);
		
		

	}

}
