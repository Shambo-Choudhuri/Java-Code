package com.java.practice;

public class ContractEqualsAndHashCode {
	
	public static void main(String[] args)
	{
		String S1=new String("durga");
		String S2=new String("durga");
		
		Tester t1=new Tester();
		Tester t2=new Tester();
		Tester t3=t1;
		

		System.out.println(S1.equals(S2));
		
		System.out.println(S1.hashCode());
		
		System.out.println(S2.hashCode());
		
		System.out.println(t1.equals(t2));
		
		System.out.println(t1.equals(t3));
		
		System.out.println(t2.equals(t3));
		
		System.out.println(t1.hashCode());
		
		System.out.println(t2.hashCode());
		
		System.out.println(t3.hashCode());
		
		System.out.println("durga".hashCode());
		
		

		
		
	}

}

class Tester
{
	
}