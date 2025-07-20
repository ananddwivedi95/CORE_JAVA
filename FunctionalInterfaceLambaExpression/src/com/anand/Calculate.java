package com.anand;

@FunctionalInterface
public interface Calculate {

	void printName();
	
	public static void methodOne()
	{
		System.out.println("method one !!");
	}
	public default void methodTwo()
	{
		System.out.println("method two !!");
	}
}
