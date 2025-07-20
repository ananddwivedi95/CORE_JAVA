package com.anand;

public class Test {
   public static void main(String[] args)
   {
		
		  TestThread thread= new TestThread(); thread.start();
		  
		  for( ; ; ) { System.out.println("Main"); }
		 
   }
}
