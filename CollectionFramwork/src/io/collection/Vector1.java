package io.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args)
{
	Vector vv= new Vector();
	vv.add(100);
	vv.add(200);
	vv.add(300);
	vv.add(400);
	Enumeration emm= vv.elements();
	while(emm.hasMoreElements()==true)
	{
		System.out.println(emm.nextElement() );
	}
	
	ArrayList aar= new ArrayList();
	aar.add(100);
	aar.add(200);
	aar.add(300);
	aar.add(400);
	aar.add(84);
	aar.add(800);
	for(int i=0;i<aar.size();i++)
	{
	    System.out.println(aar.get(i));
	   
	}
	
	Collections.sort(aar);
	System.out.println(aar);
	Iterator ITR = aar.iterator();
	while(ITR.hasNext()==true)
	{
		System.out.println(ITR.next()); 
		aar.add(500);
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
