package io.collection;

import java.util.*;

public class ArrayListDup {
public static void main(String[] args)
{
	Scanner SC= new Scanner(System.in);
	int n= SC.nextInt();
	int [] arr= new int [n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=SC.nextInt();
	}
	System.out.println(duplicates(arr,n));
}

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
           Set<Integer> items = new HashSet<>();
           Set<Integer> duplicates = new HashSet<>();
           Integer[] list = null;
		for (Integer item : list) {
               if (items.contains(item)) {
                   duplicates.add(item);
               } else {
                   items.add(item);
               }
           }
           return (ArrayList<Integer>) duplicates;
       }
       
           
    }


