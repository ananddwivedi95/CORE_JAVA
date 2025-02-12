package LaunchException;
import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class ExceptionExample1 {
   public static void main(String[] args)
	{/*
		 * try { System.out.println("connection established"); Scanner SC= new
		 * Scanner(System.in); System.out.println("enter the first number"); int num1=
		 * SC.nextInt(); System.out.println("enter the second number"); int num2=
		 * SC.nextInt(); int res=num1/num2; System.out.println(res);
		 * System.out.println("program executed sucessfully"); } catch(Exception e) {
		 * System.out.println("plese enter valid number"); }
		 */
	   
	   
	   
	   
		
		  System.out.println("connection established"); Scanner SC= new
		  Scanner(System.in); System.out.println("enter the first number"); int num1=
		  SC.nextInt();
		  
		  try { System.out.println("enter the second number"); int num2= SC.nextInt();
		  int res=num1/num2; int after_sum=res+5; System.out.println(after_sum); int
		  Size=SC.nextInt(); int [] arr=new int[Size];
		  System.out.println("enter the element to inside stored"); int
		  ele=SC.nextInt(); System.out.println("enter the pos "); int pos=SC.nextInt();
		  arr[pos]=ele; } catch(NegativeArraySizeException nae) {
		  System.out.println("plese enter valis size"); }
		  catch(ArrayIndexOutOfBoundsException aobe) {
		  System.out.println("plese enter valis pos"); } catch(ArithmeticException e) {
		  System.out.println("plese enter valis number");
		  
		  }
		  
		  System.out.println("program executed sucessfully");
		 
	   
	  
	  
   }
   
} 

