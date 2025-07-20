package com.anand;

public class TestThread extends Thread{

	@Override
	public void run() {
		
		for( ; ; )
		{
			System.out.println("world");
		}
	}
  
	
}
