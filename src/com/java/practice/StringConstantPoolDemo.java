package com.java.practice;

public class StringConstantPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String S3="You Cannot Change Me!";
		 * 
		 * String S6="You Cannot";
		 * 
		 * String S7=S6+"Change Me!";
		 * 
		 * System.out.println(S3==S7);
		 * 
		 * final String S8="You Cannot";
		 * 
		 * String S9="You Cannot"+"Change Me!";
		 * 
		 * System.out.println(S3==S9);
		 * 
		 * String S4="durga";
		 * 
		 * String S5=S4.concat("software");
		 * 
		 * String S2=S4.intern();
		 * 
		 * System.out.println(S2==S5);
		 */
		
		/*
		 * String S1=new String("You Cannot Change Me!"); 
		 * String S2=new
		 * String("You Cannot Change Me!");
		 * 
		 * String S6="You Cannot"; String S7=S6+"Change Me!";
		 * 
		 * System.out.println(S2==S7); System.out.println(S1==S7);
		 */
		
		String S1=new String("durgasoft");
		
		String S2="durga";
		
		String S3=S2+"soft";
		
		
		System.out.println(S1==S3);
		
		
		
		

	}

}
