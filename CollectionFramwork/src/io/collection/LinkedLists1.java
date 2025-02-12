package io.collection;

import java.util.LinkedList;

public class LinkedLists1 {
public static void main(String[] args)
{
	LinkedList LKK= new LinkedList();
	LKK.add(18);
	LKK.add(85);
	LKK.add(84);
	LKK.add(78);
	System.out.println(LKK.getFirst());
	System.out.println(LKK.getLast());
	System.out.println(LKK.get(3));
	System.out.println(LKK.getClass());
	System.out.println(LKK.peekFirst());
	System.out.println(LKK.peekLast());
	System.out.println(LKK.peek());
	System.out.println(LKK.poll());
	System.out.println(LKK.pollFirst());
	System.out.println(LKK.pollLast());
	System.out.println(LKK.pollFirst());
	System.out.println(LKK.pollFirst());


	
}
}
