package io.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListFrequency {
public static void main(String[] args)
{
	Scanner SC= new Scanner(System.in);
	ArrayList<String> ARR= new ArrayList<String>();
	String str;
	while(!(str=SC.nextLine()).equals("end"))
	{
		ARR.add(str);
	} 
	System.out.println(Collections.frequency(ARR, "n"));
	String max=Collections.max(ARR);
	System.out.println(max);
}
}
