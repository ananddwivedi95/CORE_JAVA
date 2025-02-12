package MultiThreading;
class Threads extends Thread
{
	public void run()
	{   
		for(int i=0;i<10;i++)
		System.out.println("hello");
	}
}
public class MultithreadingByThreadClass {
       public static void main(String[] args)
        {
	       Threads tt= new Threads();
	       tt.start();
	       table();
        }
       public static void table()
       {
    	   for(int i=0;i<10;i++)
    	   System.out.println(i+1);
       }
}
