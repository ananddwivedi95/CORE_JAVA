package com.thread;

public class TestByThread extends Thread{

	TestByThread(String name)
	{
		super(name);
	}
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is running !!");
			Thread.yield();
		}
	}

	
	
}
