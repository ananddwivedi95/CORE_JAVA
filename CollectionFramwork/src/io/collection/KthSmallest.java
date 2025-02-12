package io.collection;

import java.util.Arrays;

public class KthSmallest {
public static void main(String[] args)
{
	int arr[]= {7, 10, 4, 3, 20, 15};
	int n=6;
	int k=3;
	for(int i=0;i<arr.length;i++)
	{    int temp=0;
		for(int j=i+1;j<arr.length;j++)
		{
		   if(arr[i]>arr[j])
		   {
			   temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
		   }
		}
	}
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println(arr[k-1]);
}
}
