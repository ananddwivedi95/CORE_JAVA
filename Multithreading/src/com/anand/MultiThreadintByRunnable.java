package com.anand;

public class MultiThreadintByRunnable {
  public static void main(String[] args)
  {
	
	  ByRunnable runnable= new ByRunnable();
	  Thread thread= new Thread(runnable);
	  thread.start();
	
	  for( ; ;)
	  {
		  System.out.println("hello");
	  }
  }
}
