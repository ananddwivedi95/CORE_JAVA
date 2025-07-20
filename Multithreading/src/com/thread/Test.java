package com.thread;

public class Test {
	
   public static void main(String[] args) throws InterruptedException
   {
	  
	   
	     //Multithreading by thread class
		
		  TestByThread thread= new TestByThread("t1"); 
		  TestByThread thread2= new TestByThread("t2"); 
		  thread.start();
		  thread2.start();
		  
		 
	   
	   //MultiThreading by runnable interface
	   
		/*
		 * TestByRunnable test= new TestByRunnable(); Thread thread= new Thread(test);
		 * thread.start(); thread.join();
		 * 
		 * for(int i=1;i<=10;i++ ) { System.out.println("hello "); }
		 */
   }
}
