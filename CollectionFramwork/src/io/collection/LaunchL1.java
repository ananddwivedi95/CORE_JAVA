package io.collection;
import java.util.*;
public class LaunchL1 {
public static void main(String[] args)
{
	ArrayList AL1= new ArrayList();
	AL1.add(10);
	AL1.add(20);
	AL1.add(30);
	AL1.add(32);
	System.out.println(AL1.indexOf(30));
	System.out.println(AL1);
	System.out.println("*********************");
	AL1.add(4,25);
    System.out.println("element after 4th position adding"+AL1);
    AL1.add(96);
    System.out.println("element after 9th position adding"+AL1);


	ArrayList AL2= new ArrayList();
	AL2.add("anan");
	AL2.add("30");
	//we can add entire collection into new collection
	System.out.println(AL2);
	System.out.println("*********************");
	ArrayList AL3= new ArrayList();
	AL3.addAll(AL1);
	System.out.println(AL3);
	System.out.println("*********************");
    ArrayList AL4= new ArrayList();
    AL4.add(AL1);
    System.out.println(AL4);
	System.out.println("*********************");
	AL4.add(1, 25);
    System.out.println("element after 1nd position adding"+AL4);
    AL4.add(95);
    System.out.println("element after rare position adding"+AL4);

}
}
