package io.collection;

import java.util.Scanner;
public class String1 {

public static void main(String[] args)
{ 
	int fact = 1;
	
	
	String str1;
	Scanner SC=new Scanner(System.in);
    str1=SC.nextLine();
  //  System.out.println(str1.toUpperCase());
    System.out.println(str1.toUpperCase().replace(" ", ""));
	for(int i=1;i<=str1.replace(" ", "").length();i++)
	{
	    fact=fact*i;
	}
	System.out.println(fact);
}
}
