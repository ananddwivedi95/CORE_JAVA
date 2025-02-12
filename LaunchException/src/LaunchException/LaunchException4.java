package LaunchException;

import java.util.Scanner;

class Alpha1
{
	public void alpha() throws ArithmeticException 
	{
		 
		 System.out.println("connection established");
		 try
		 {
		 Scanner SC= new
				  Scanner(System.in); System.out.println("enter the first number"); int num1=
				  SC.nextInt();
				  
				  System.out.println("enter the second number"); int num2= SC.nextInt();
				  int res=num1/num2;
				  System.out.println(res);
		 }
	
		 catch( ArithmeticException ame)
		 {
		       //System.out.println("pese enter valis number");
			   System.out.println("handl by alpha");
			   throw ame;
		 }
				  System.out.println("program executed sucessfully");

	}
}
class Beta1
{
	public void beta() throws ArithmeticException 
	{
		try
	{
		Alpha1 AL= new Alpha1();
		AL.alpha();
	} 
	catch(ArithmeticException ame)
	{
		System.out.println("handl by beta ");
		System.out.println(ame.getMessage());
	}
	}
}
public class LaunchException4 {
	public static void main(String[] args) throws ArithmeticException
	{
		try
		{
			Beta1 BT = new Beta1();
			BT.beta();
		}
		catch(ArithmeticException ame)
		{
			System.out.println("handl by main ");
			
			
		}
	}

}
