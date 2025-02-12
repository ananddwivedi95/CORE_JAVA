package MultiThreading;


	
	/*
	 * public static void main(String...args) { MultiThreading2 TE= new
	 * MultiThreading2(); String str=null; //Test TT= new Test(); //Thread T= new
	 * Thread(TT); //T.start(); System.out.print("main Thread\n"); TE.main(str);
	 * 
	 * 
	 * }
	 * 
	 * public static void main(String str ) {
	 * System.out.println("main methos is over loaded"); }
	 */
	



//class Test implements Runnable
//{
//
//	@Override
//	public void run() {
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("child thread");
//		}
//		
//	}
//	
//}
	



class MultithreadingDemo implements Runnable {
    @Override
	public void run() {
        System.out.println("Thread ");
    }
}

public class MultiThreading2 {
    public static void main(String[] args) {
        MultithreadingDemo TMTE=  new MultithreadingDemo();
    	Thread object = new Thread(TMTE);
        object.start();
        for (int i = 0; i < 10; i++)
        	System.out.println("Main Thread");
           
        
    }
}