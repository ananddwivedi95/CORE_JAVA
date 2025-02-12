package io.collection;
import java.util.*;
public class LinkedLists {
public static void main(String[] args)
{
	LinkedList LK1= new LinkedList();
	   LK1.add(10);
	   LK1.add(41);
	   LK1.add("anand");
	   LK1.add(17);
	   LK1.add(85);
	   System.out.println(LK1);
	   System.out.println("********************************************");
	   LK1.addFirst("anand");
	   System.out.println(LK1);
	   System.out.println("**********************************************");
	   LK1.add(3,"Dwivedi");
	   LK1.add(4,"SDE");
	   System.out.println(LK1);
}
}
