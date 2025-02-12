package io.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashSing {
public static void main(String[] args)
{
	HashSet HSS= new HashSet();
	HSS.add(54);
	HSS.add(85);
	HSS.add(85);

	HSS.add(74);
	HSS.add(45);

	HSS.add(97);
	HSS.add(40);
	System.out.println(HSS);
	System.out.println(HSS.contains(54));
	System.out.println(HSS.remove(45));
	/*
	 * Iterator ITT= HSS.iterator(); for(int i=0;i<HSS.size();i++) {
	 * if(ITT.hasNext()==true) { System.out.println( ITT.next()); } }
	 */
	Iterator ITT= HSS.iterator();
	while(ITT.hasNext()==true)
	{
		System.out.println(ITT.next());
	}
	System.out.println(ITT.equals(97));
}
}
