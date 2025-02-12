package MultiThreading;

 class MyThread{
    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread().getName());
        Main MM = new Main();
        Thread t1 = new Thread(MM);
        t1.start();
    }
}
public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
}

