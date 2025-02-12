package io.collection;

import java.util.Arrays;

public class MinimizeTheHeights {
    public static void main(String[] args)
    {
    	int N=8;
    	int K=7;
    	int arr[]=
        {1, 8, 10, 6, 4, 6, 9, 1};
    	Arrays.sort(arr);
        for(int i:arr)
        {
     	   System.out.println(i);
        }
       
           for(int i=0;i<N;i++)
           {
        	if(i<(N/2))
        	{
        		arr[i]=arr[i]+K;
        	}
        	else
        	{
        		arr[i]=arr[i]-K;
        	}
        	
        }
           for(int i:arr)
           {
        	   System.out.print(i+" ");
           }
           Arrays.sort(arr);
           for(int i:arr)
           {
        	   System.out.print(i+" ");
           }
           System.out.println(arr[N-1]-arr[0]);
    }
}
