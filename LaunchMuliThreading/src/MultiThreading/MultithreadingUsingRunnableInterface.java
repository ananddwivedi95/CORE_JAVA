package MultiThreading;
class Test implements Runnable
{   @Override
	public void run()
	{
	    for(int i=0;i<5;i++)
		System.out.println("hello");
	}
}
public class MultithreadingUsingRunnableInterface {
      public static void main(String[] args)
      {
    	  Test t= new Test();
    	  Thread tt= new Thread(t);
    	  tt.start();
    	  mess();
      }
      public static void mess()
      {
    	  for(int i=0;i<10;i++)
    		 System.out.println("hii");
      }
}
