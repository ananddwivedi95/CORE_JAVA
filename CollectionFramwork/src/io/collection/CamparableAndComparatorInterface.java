package io.collection;

import java.util.ArrayList;
import java.util.Collection.*;
import java.util.Collections;
import java.util.Comparator;
//sort collection using comparator interface it is make different class of import the comparator interface using java.util.Comparator;
//comparator interface is use when master class is not accesible or not modidify means where the actual variable is present 
//comparator interface is function interface because there only one abstract is present thats why we can also override and implements it compare() using functional interface
//Comparator interface have only one abstract method that is compare() 
public class CamparableAndComparatorInterface {
	public static void main(String[] args) {
		Student str1 = new Student("puneet", 45, 16);
		Student str2 = new Student("anand", 44, 18);
		Student str3 = new Student("ranjee", 14, 15);
		ArrayList<Student> ARR = new ArrayList<Student>();
		ARR.add(str1);
		ARR.add(str2);
		ARR.add(str3);
		//CamparatorClass cc= new CamparatorClass();
		Comparator<Student> cc=(Student a,Student b)->{
			if(a.age>b.age)
				return 1;
			else
				return -1;
		};
		Collections.sort(ARR,cc);;
		System.out.println(ARR);
	}
}

/*
 * class CamparatorClass implements Comparator<Student> {
 * 
 * @Override public int compare(Student a, Student b) { if(a.age>b.age) return
 * 1; else return -1; }
 * 
 * }
 */
class Student {
	String name;
	int marks;
	int age;

	public Student(String name, int marks, int age) {
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

}
