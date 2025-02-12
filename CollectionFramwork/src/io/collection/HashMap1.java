package io.collection;
import java.util.HashMap;
public class HashMap1 {
public static void main(String [] args)
{
HashMap<String,Integer> HSS=new HashMap<>();
HSS.put("india",140);
HSS.put("china",150);
HSS.put("US",30);
System.out.println(HSS);
HSS.put("china", 160);
System.out.println(HSS);
HSS.put("ruse", 120);
System.out.println(HSS);
System.out.println(HSS.containsKey("china"));
if(HSS.containsKey("indoneshia"))
{
	System.out.println("indoneshia present ");
}
else
{
	System.out.println("indoneshia is not present");
	
}
System.out.println(HSS.get("china"));

}
}
