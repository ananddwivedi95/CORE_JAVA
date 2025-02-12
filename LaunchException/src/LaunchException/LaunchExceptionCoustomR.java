package LaunchException;

import java.util.Scanner;

class Atm 
{
	int user_id=1212;
	int user_password=125458;
	int pw;
	int uid;
	public void input()
	{
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the user_id ");
	    uid=SC.nextInt();
		System.out.println("Enter the user_password ");
		pw=SC.nextInt();
		
	}
	public void personVerifi() throws NotFoundException
	{
		if(user_id==uid&& user_password==pw)
		{
			System.out.println("you can take case ");
			
		}
		else
		{ 
			NotFoundException EXP=new NotFoundException("are you sure you try agin ");
			System.out.println(EXP.getMessage());
		
			throw EXP;
		
		}
	}
}
class NotFoundException extends Exception 
{
     public NotFoundException(String msg)
     {
    	 super(msg);
     }
}
class Bank 
{
	NotFoundException EXP=new NotFoundException(null);
	public void run()
	{
		Atm ATM= new Atm();
		
		
		try {
			ATM.input();
			ATM.personVerifi();
		} catch (NotFoundException e) {
			try {
				ATM.input();
				ATM.personVerifi();
			}
			catch(NotFoundException e1)
			{
				ATM.input();
				try {
					ATM.input();
					ATM.personVerifi();
				} catch (NotFoundException e2) {
					System.out.println("are you caught chor");
					System.out.println(EXP.getStackTrace());
				}
			}
		}
		
	}
}

public class LaunchExceptionCoustomR {
	public static void main(String[] args)
	{
		Bank BNK= new Bank();
		BNK.run();
	}

}
