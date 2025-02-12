package io.collection;
import java.util.ArrayList;
class ArraysList
{
	public static void arrayList()
	{
		ArrayList AL1= new ArrayList();
		AL1.add(5);
		AL1.add(54);
		AL1.add(45);
		AL1.add(45);
		AL1.add(88);
		System.out.println(AL1);
		System.out.println("**************************************");
		AL1.add(2, "anand");
		System.out.println(AL1);
		System.out.println("***************************************");
		ArrayList AL2= new ArrayList();
		AL2.addAll(AL1);
		System.out.println(AL2);
		System.out.println("****************************************");
		System.out.println(AL2.clone());
		System.out.println("*******************************************");
		System.out.println(AL2.contains(45));
		System.out.println("************************************************");
		System.out.println(AL2.lastIndexOf(45));
		System.out.println("************************************************");
		System.out.println(AL2.indexOf(45));
		System.out.println(AL2);
		System.out.println(AL2.isEmpty());
		ArrayList AL3= new ArrayList();
		System.out.println(AL3.isEmpty());
		System.out.println("**************************************");
		System.out.println(AL3.getClass());
		System.out.println(AL2.lastIndexOf(45));
		AL3.add(40);
		
	}
}
public class LaunchLL1
{ 
	public static void main(String[] args)
	{
	   ArraysList ALL1= new ArraysList();
	   ALL1.arrayList();
	}
	
}