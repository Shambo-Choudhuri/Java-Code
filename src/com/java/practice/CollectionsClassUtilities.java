package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassUtilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		
		String[] strArray= {"ratan","anu","sravya"};
		
		Collections.addAll(al, strArray);
		
		
		
		System.out.println(al);

	}

}
