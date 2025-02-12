package io.collection;
import java .util.ArrayDeque;
public class ArrayDoublEndedDeQue {
public static void main(String[] args)
{
	ArrayDeque AD= new ArrayDeque();
	AD.add(10);
	AD.add(20);
	AD.add(30);
	AD.add(70);
	AD.add(78);
	System.out.println(AD);
	AD.addFirst(47);
	AD.addLast(85);
	System.out.println(AD);
	System.out.println(AD.size());
	System.out.println(AD.getFirst());
}
}
