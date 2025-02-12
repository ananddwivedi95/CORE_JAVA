package io.collection;

import java.util.ArrayList;

class LeaderElement {
    // Function to find the leaders in the array.
	public static void main(String[] args)
	{ 
		  int arr[]= { 16,17,4,3,5,2}; System.out.println(leaders(6,arr));
		 
	}
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList ARR=new ArrayList();
        ArrayList ARRR= new ArrayList();
        int count =0;
       
        for(int i=0;i<arr.length;i++)
        {
        	boolean b=true;
          for(int j=i+1;j<arr.length;j++)
          { 
        	  b=true;
              if(arr[i]>=arr[j])
              { 
            	  b=false;
                  count =arr[i];
                  
              }
              else
              break;
          }
          if(b!=true)
          {
              ARR.add(count);
          }
          if(i==arr.length-1)
          {
        	  ARR.add(arr[i]);
          }
        }
        return  ARR;
        
    }
  
}