package com.java.practice;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulate e=new Encapsulate();
		e.setName("Durga");
		e.setAge(32);
		e.setID(100);
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getID());

	}

}


class Encapsulate
{
	//Data-Hiding
	private String Name;
	private int Age;
	private int ID;
	
	//Member-Functions
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	public void setAge(int Age)
	{
		this.Age=Age;
	}
	
	public void setID(int ID)
	{
		this.ID=ID;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	public int getAge()
	{
		return this.Age;
	}
	
	public int getID()
	{
		return this.ID;
	}
}

