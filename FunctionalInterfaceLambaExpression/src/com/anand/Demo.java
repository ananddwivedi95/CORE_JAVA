package com.anand;

public class Demo {
  
	public static void main(String[] args)
	{
		//creating the refrence variable of interface 
		/*
		 * Calculate clc= new Camel(); clc.printName();
		 */
		
		//lambda expression implementation 
		Calculate clc= () ->
		{
			System.out.println("clulator company name is camel !!");
		};
		clc.printName();
	}
}
