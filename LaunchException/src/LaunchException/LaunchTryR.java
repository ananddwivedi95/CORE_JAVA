package LaunchException;
import java.util.Scanner;
public class LaunchTryR {
	public static void main(String[] args)
	{
		try(Scanner SC= new Scanner(System.in))
		{
		String nam=SC.nextLine();
		System.out.println(nam);
		int nu=18/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
