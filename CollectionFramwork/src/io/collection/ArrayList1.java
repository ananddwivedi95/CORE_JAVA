package io.collection;

import java.util.*;

public class ArrayList1 {
	public static void main(String... s) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(9);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		LinkedList<String>LL= new LinkedList<String>();
		
		System.out.print(arr);

		  ArrayList arr1 = new ArrayList(); 
		  for (int i = 0; i < arr.size()-1; i++) {
		   arr1.add((int)arr.get(i)*(int)arr.get(i + 1));
		  } 
		  System.out.println(arr1);
		 

	}

}
