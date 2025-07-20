package com.anand.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    List<Emp> employee= new ArrayList<>();
    employee.add(new Emp("anand","900000",1));
    employee.add(new Emp("raj","9090000",5));
    employee.add(new Emp("jhone","9095545",4));
    employee.add(new Emp("anan","964158579",2));
    
    
    System.out.println(employee);
    Collections.sort(employee, new IdComparator());
    System.out.println(employee);
   
    Collections.sort(employee,new nameComparator());
	System.out.println(employee);	
	}
}
