package io.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class AcessValue {
	public static void main(String[] args) {
		HashMap<Integer,Integer> ss= new HashMap();
		ss.put(1,25);
		ss.put(0,45);
		System.out.println(ss.entrySet());

		// System.out.println(AAL.reversed());
		/*
		 * for(int i=0;i<AAL.size();i++) { System.out.println(AAL.get(i));
		 * System.out.println(AAL.getClass()); }
		 */

		/*
		 * Iterator ITR=AAL.iterator(); while(ITR.hasNext()) { for(int
		 * i=AAL.size();i>=1;i--) { int i=(Integer)ITR.next(); if(i%2==0) {
		 * System.out.println(i+" "+" "); } } }
		 */
	}
}
