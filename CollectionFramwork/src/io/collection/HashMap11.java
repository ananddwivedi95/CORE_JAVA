package io.collection;
import java.util.*;
public class HashMap11 {
public static void main(String[] args)
{
	HashMap HM= new HashMap();
	HM.put(1, "Annan");
	HM.put(2, "Dwivedi");
	HM.put(18,"raj");
	HM.put(4,"united institute of technology");
	HM.put(19,"prayagraj");
	HM.put(20,"2nd yrear00");
	LinkedHashMap HS= new LinkedHashMap();
	HS.put(1, "Annan");
	HS.put(2, "Dwivedi");
	HS.put(18,"raj");
	HS.put(4,"united institute of technology");
	HS.put(19,"prayagraj");
	HS.put(20,"2nd yrear00");
	System.out.println(HM);
	Collection ITR= HM.values();
	Iterator c=ITR.iterator();
	while(c.hasNext())
	{
		System.out.println(c.next());
	}
	Collection ITR1= HS.values();
	Iterator c1=ITR1.iterator();
	while(c1.hasNext())
	{
		System.out.println(c1.next());
	}
	
	System.out.println(HS);
	
}
}
