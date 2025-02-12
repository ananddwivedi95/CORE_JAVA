package io.collection;

import java.util.Scanner;

public class RotationOfArray {
public static void main(String[] args)
{
	Scanner SC = new Scanner(System.in);
	int n=SC.nextInt();
		int [] arr=new  int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=SC.nextInt();
		}
		int k=SC.nextInt();
		rotateArray(arr,n,k);

}
public static void rotateArray(int [] arr,int n,int k)
{   k=k%n;
	int [] arr1= new int[n];
	int index=0;
	for(int i=n-k;i<n;i++)
	{    
	     arr1[index++]=arr[i];
	}
	for(int i=0;i<arr.length-k;i++)
	{
		arr1[index++]=arr[i];
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr1[i]+" ");
	}
	String str="jai";
	
	System.out.println(str.lastIndexOf("i"));
	}
}
