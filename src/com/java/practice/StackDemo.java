package com.java.practice;

import java.util.Stack;

public class StackDemo {
	
	public void stack_push(Stack<Integer> s)
	{
		 for(int i=1;i<=5;i++)
		 {
			 s.push(i);
		 }
	}
	
	public void stack_pop(Stack<Integer> s)
	{
		for(int i=1;i<=5;i++)
		{
			Integer I=(Integer)s.pop();
			System.out.println(I);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s=new Stack<Integer>();
		
		
		
		
		

	}

}
