package io.collection;

import java.util.TreeSet;

public class TreeSet1 {
public static void  main(String[] args)
{
	TreeSet TSS= new TreeSet();
	TSS.add(40);
	TSS.add(50);
	TSS.add(100);
	TSS.add(25);
	TSS.add(78);
	TSS.add(445);
	System.out.println(TSS);
	System.out.println(TSS.ceiling(100));
	System.out.println(TSS.floor(100));
	System.out.println(TSS.ceiling(110));
	System.out.println(TSS.floor(90));
	System.out.println(TSS.higher(100));
	System.out.println(TSS.lower(85));
	
	
}
}
