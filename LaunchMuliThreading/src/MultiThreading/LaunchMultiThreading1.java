package MultiThreading;
class MyThread extends Thread
{    @Override
	public void run()
	{
		/*
		 * for(int i=1;i<=10;i++) { System.out.println("MyThread thread"); }
		 */
	}
}
public class LaunchMultiThreading1 {
public static void main(String[] args)
{  
	 MyThread MT= new  MyThread();
	 MT.start();
	for(int i=1;i<=10;i++)
	{  
		System.out.println("main thread");
	}
}
}
