package Exception.Handling;

public class UsingThrowsKeyword {
	public static void main(String[] args)
	{
		int age=0;
        try
        {
        	if(age<18)
        	{
        		throw new age("check age");
        	}
        }
        catch(age e){
        	System.out.println(e);
        }
        finally
        {
        	System.out.println("sucess");
        }
}
}
class age extends RuntimeException
{
	age(String name)
	{
		super(name);
	}
}