package LaunchException;
  import java.util.Scanner;
public class LaunchLicenceException {
	public static void main(String[] args) throws Throwable
	{
		RtoCheck RC= new RtoCheck();
		RC.rtoStartVerification();
	}

}
class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}
class CheckEligible
{
	int age;
	public void checkEligiblity()
	{
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the age of applicant");
		age=SC.nextInt();
	}
	public void verifyEligibelity() throws Throwable
	{
		if(age>=18)
		{
			if(age>=60)
			{
				OverAgeException OAE= new OverAgeException("above '60' are you sure ?");
				System.out.println(OAE.getMessage());
				System.err.println(OAE.getStackTrace());
				throw OAE;
			}
			else {
				System.err.println("you are eligible for application \nyou can progress with   your application");
			}
		}
		else
		{
			UnderAgeException UAE= new UnderAgeException("are you '18' over sure ");
			System.err.println(UAE.getMessage());
			System.err.println(UAE.getStackTrace());
			throw UAE;
		}
	}
}
class RtoCheck{
	public void rtoStartVerification() throws Throwable 
	{
		CheckEligible CEL= new CheckEligible();
		try
		{
			CEL.checkEligiblity();
			CEL.verifyEligibelity();
		}
		catch( OverAgeException  | UnderAgeException e3 )
		{
			CEL.checkEligiblity();
			CEL.verifyEligibelity();
			
			try
			{
				CEL.checkEligiblity();
				CEL.verifyEligibelity();
			}
			catch( OverAgeException  | UnderAgeException e1)
			{
				System.out.println("your session expire");
		}
		}
	}
}

