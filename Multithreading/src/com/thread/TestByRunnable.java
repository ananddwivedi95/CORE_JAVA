package com.thread;

public class TestByRunnable implements Runnable{

	
	@Override
	public void run() {
	 for(int i=1;i<=10;i++)
	 {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("mical !!");
	 }
	
	 
	}

}
