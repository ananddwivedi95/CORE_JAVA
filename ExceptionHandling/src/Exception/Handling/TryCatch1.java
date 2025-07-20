package Exception.Handling;

public class TryCatch1 {
public static void main(String[] args)
{
	int a=10;
	int b=0;
	try
	{
		System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
		System.out.println("check input");
	}
	catch(Exception e)
	{
		System.out.println("check all input");
	}
	finally
	{
		System.out.println("thankyou");
	}
}
}
