package LaunchException;

import java.util.Scanner;

public class ExceptionHandling5 {
public static void main(String[] args)
{
	NumberIsOddException NIO= new NumberIsOddException();
	Scanner SC= new Scanner(System.in);
	System.out.println("enter the value");
	int n=SC.nextInt();
	NIO.check(n);
}
}
class CheckOddNumber extends NumberIsOddException
{
	public void checkOdd(int n)
	{
		if(n%2!=0)
		{
			throw new IllegalArgumentException("it is odd number "+n);
		}
	}
}
class NumberIsOddException 
{
	public void check(int n)
	{
		
		try
		{
		CheckOddNumber CON= new CheckOddNumber();
		CON.checkOdd(n);
		System.out.println("number is even "+n);
		}
		catch(IllegalArgumentException OE)
		{
			System.out.println(OE.getMessage());
		}
	}
}
