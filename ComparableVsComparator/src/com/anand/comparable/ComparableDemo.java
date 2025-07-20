package com.anand.comparable;

import java.util.ArrayList;
import java.util.Collections;
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    ArrayList<Emp> employee= new ArrayList<>();
    employee.add(new Emp("anand","900000",1));
    employee.add(new Emp("raj","9090000",5));
    employee.add(new Emp("jhone","9095545",4));
    employee.add(new Emp("anan","964158579",2));
    
    
    System.out.println(employee);
    Collections.sort(employee);
    System.out.println(employee);
   
		
	}

	 
}