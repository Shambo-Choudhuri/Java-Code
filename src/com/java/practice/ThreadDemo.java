package com.java.practice;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		
		t.start();
		
		Thread thread=Thread.currentThread();
		
		thread.setPriority(4);
		
		System.out.println("Thread Priority=" +thread.getPriority());
		
		System.out.println("Current Running Thread = " +thread.getName());
		
		System.out.println("Job of Main Thread");
		
		

	}

}

class MyThread extends Thread
{
	public void run()
	{
		Thread thread=Thread.currentThread();
		thread.setName("Child Thread-1");
		System.out.println("Current Running Thread = " +thread.getName());
		int priority=Thread.MIN_PRIORITY;
		System.out.println("Thread Priority=" +thread.getPriority());
		System.out.println("Job of Child Thread");
	}
}


