package LaunchException;

import java.util.Scanner;

public class LaunchException2 {
	public static void main(String[] args)
	{
		 int [] arr = null;
		 int	  ele = 0;
		    System.out.println("connection established");
		    Scanner SC= new
				  Scanner(System.in); 
		    System.out.println("enter the first number"); int num1=
				  SC.nextInt();
				  
		    try 
		    {
		    	System.out.println("enter the second number");
		    int num2= SC.nextInt();
		    int res=num1/num2; 
		    int after_sum=res+5;
		    System.out.println(after_sum);
		    }

		    catch(ArithmeticException e)
		    {
		  System.out.println("plese enter valis number");
				  
	  }
		    try
		    {
		    int Size=SC.nextInt();
		   arr=  new int[Size];
		   System.out.println("enter the element to inside stored"); 
		   ele=SC.nextInt();
		   System.out.println("enter the pos ");
		    }
		   
		    
		    catch(NegativeArraySizeException nae)
		    {
				  System.out.println("plese enter valis size");
			}
			
		    try {
		       int pos=SC.nextInt();
				  arr[pos]=ele;
				  System.out.println(ele);
		    }
		    catch(ArrayIndexOutOfBoundsException aobe)
		    {
				  System.out.println("plese enter valis pos");
     		}
		   
		    	  
				  System.out.println("program executed sucessfully");
				 
			   
			  
	}

}
