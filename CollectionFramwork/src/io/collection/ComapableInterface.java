package io.collection;

import java.util.ArrayList;
import java.util.Collections;
//sort collection using comparable interface--comparable interface is implements in master class means where the actual variable present and override the compareTO method
//comparable interface is used when the master class is assesible and modificable
//comparable interface have abstract method that is CompareTo()
//here is no need to call the compareTo method it is directly call by jvm internally when we call Collections.sort()
public class ComapableInterface {
public static void main(String[] args)
{
	Studentt str1 = new Studentt("puneet", 45, 16);
	Studentt str2 = new Studentt("anand", 44, 18);
	Studentt str3 = new Studentt("ranjee", 14, 15);
	ArrayList<Studentt> ARR = new ArrayList<Studentt>();
	ARR.add(str1);
	ARR.add(str2);
	ARR.add(str3);
	Collections.sort(ARR);
	System.out.println(ARR);
	
}


}
class Studentt implements Comparable<Studentt>{
	String name;
	int marks;
	int age;

	public Studentt(String name, int marks, int age) {
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	 public void setName(String name) { this.name = name; }
	 public void setMark(int marks) { this.marks = marks; }
	 public void setAge(int age) { this.age = age; }
		
	@Override
	public String toString() {
		return "name-" + name + " mark-" + marks + " age-" + age;
	}
	@Override
	public int compareTo(Studentt a) {
		if(this.age>a.age)
		return 1;
		else
			return -1;
	}

}

