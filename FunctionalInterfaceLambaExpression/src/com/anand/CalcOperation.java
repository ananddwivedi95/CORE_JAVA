package com.anand;

@FunctionalInterface
public interface CalcOperation {

   double operation(int a , int b);
   
   public default void printInfo()
   {
	   System.out.println("This Default Data..of method");
   }
   
   public static void typeOfOperation()
   {
	   System.out.println("This Static .. arithmatic calculation");
   }
  
}
