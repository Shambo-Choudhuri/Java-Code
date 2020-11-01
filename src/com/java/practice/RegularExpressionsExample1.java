package com.java.practice;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegularExpressionsExample1 RegularExpressionsExample1=new RegularExpressionsExample1();
		
		//Pattern Class Split method
		
		/*Pattern p=RegularExpressionsExample1.m1("A");
		
		String[] s=p.split("Durga.Software.Solutions");*/
		
		//String class Split method
		
		/*String s="Durga Software Solutions";
		
		String[] s1=s.split("\\s");
		
		for(String s2:s1)
		{
			System.out.println(s2);
		}*/
		
		StringTokenizer st=new StringTokenizer("Durga-Software-Solutions","-");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
	}
	
	public Pattern m1(String c)
	{
		Pattern p=Pattern.compile(c);
		return p;
	}
	

}
