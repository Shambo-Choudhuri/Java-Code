package com.java.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args)
	{
		LinkedList<String> object=new LinkedList<String>();
		
		//Adding elements to the linked list
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		
		System.out.println("Linked List Object : " +object);
		
		object.add(3, "M");
		
		System.out.println("Linked List Object : " +object);
		
		object.remove(2);
		
		System.out.println("Linked List Object : " +object);
		
		ListIterator<String> ltr=object.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		
		
	}
	

}
