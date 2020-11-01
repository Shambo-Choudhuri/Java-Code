package com.java.practice;

public class ThisKeywordConcept {
	
	int x;
	String name;
	Employee e;
	double d;
	void m1()
	{
		this.m2(this);
		System.out.println("m1");
	}
	void m2(ThisKeywordConcept t)
	{
		System.out.println(this);
	}
	
	ThisKeywordConcept getA()
	{
		return this;
	}
	
	ThisKeywordConcept(int x,String name,Employee e)
	{
		this.x=x;
		this.name=name;
		this.e=e;
	}
	
	ThisKeywordConcept(int x,String name,Employee e,double d)
	{
		this(x,name,e);
		this.d=d;
	}
	
	void display1()
	{
		System.out.println(this.x+" "+this.name+" "+this.e);
	}
	
	void display2()
	{
		System.out.println(x+" "+name+" "+e+" "+d);
	}

	public static void main(String[] args) {
		ThisKeywordConcept t1= new ThisKeywordConcept(10,"Finch",new Employee());
		ThisKeywordConcept t2= new ThisKeywordConcept(20,"Warner",new Employee(),3000.50);
		t1.m1();
		System.out.println(t1);
		t1.display1();
		new ThisKeywordConcept(20,"Warner",new Employee(),3000.50).getA().display2();
		

	}

}
class Employee
{
	
}
