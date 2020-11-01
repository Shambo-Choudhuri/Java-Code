package com.java.practice;

public class GarbageCollectionDemo {
	
	static Demo d=new Demo();//Creating Object
	
	static Demo d1=new Demo();
	
	public void finalize()
	{
		System.out.println("Finalize Method Called For Clean-up");  //Executed by Daemon-Thread
	}
	
	static
	{
		d=null;
		d1=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		//Object Eligible for GCN
		
		Runtime r=Runtime.getRuntime();
		
		r.gc();//Requesting JVM to run GCL
		
		//JVM Runs GCL and GCL calls finalize() method on Demo class object eligible for GCN to perform Clean-up activities
		//As soon as Clean-up activities are done then GCL automatically destroys Demo class Object 
		//finalize() method of Demo class is called
		
		System.out.println("End of Main Thread");//Executed by Main-Thread
		
		
		
		
		
		
		

	}

}

class Demo
{
	public void finalize()
	{
		System.out.println("Finalize Method Called"); //Executed by Daemon-Thread
	}
}