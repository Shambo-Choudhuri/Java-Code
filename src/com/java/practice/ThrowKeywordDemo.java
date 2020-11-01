package com.java.practice;

import java.io.FileNotFoundException;

public class ThrowKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			throw new FileNotFoundException();
			//System.out.println("hello");
		}
		catch (FileNotFoundException f)
		{
			System.out.println(f.getMessage());
		}
	 

	}

}
