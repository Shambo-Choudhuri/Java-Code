package com.java.practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=5;
		
		ArrayList<Integer> l=new ArrayList<Integer>(size);
		
		for(int i=1;i<=size;i++)
		{
			l.add(i);
		}
		
		System.out.print(l);
		
		for(int i=0;i<size;i++)
		{
			System.out.print(l.get(i)+ " ");
		}

	}

}
