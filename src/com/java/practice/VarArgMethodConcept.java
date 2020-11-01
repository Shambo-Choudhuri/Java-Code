package com.java.practice;

public class VarArgMethodConcept {
	
	void m1(Animal... a)
	{
		System.out.println("m1 method");
		//return new Animal();
	}

	public static void main(String[] args) {
		
		new VarArgMethodConcept().m1(new Animal(),new Animal(10),new Animal("Micky","Pola"));

	}

}
class Animal
{
	int x;
	String name1;
	String name2;
	Animal(int x)
	{
		this.x=x;
		
	}
	Animal(String name1,String name2)
	{
		this.name1=name1;
		this.name2=name2;
	}
	Animal()
	{
		
	}
}


