package LaunchException;

import java.util.Scanner;

class Alpha
{
	public void alpha() throws ArithmeticException
	{
		 System.out.println("connection established"); Scanner SC= new
				  Scanner(System.in); System.out.println("enter the first number"); int num1=
				  SC.nextInt();
				  
				  System.out.println("enter the second number"); int num2= SC.nextInt();
				  int res=num1/num2; int after_sum=res+5; System.out.println(after_sum); int
				  Size=SC.nextInt(); int [] arr=new int[Size];
				  System.out.println("enter the element to inside stored"); int
				  ele=SC.nextInt(); System.out.println("enter the pos "); int pos=SC.nextInt();
				  arr[pos]=ele;
				  
				  System.out.println("program executed sucessfully");

	}
}
class Beta
{
	public void beta() throws ArithmeticException
	{
		Alpha AL= new Alpha();
		AL.alpha();
	}
}
public class LaunchException3 {
					public static void main(String[] args)
					{			
						
						try
						{
						Beta BB= new Beta();
						BB.beta();
						}
						catch(ArithmeticException ame )
						{
							System.out.println("hendl in main");
						}
					}
}
