package io.operation;
class Student
{
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	  @Override public String toString() { return "Student id=  " + id +
	  "  name = " + name + " age = " + age ; }
	    
	
}
public class Open {
	public static void main(String[] args)
	{
		Student s1= new Student(10,"anushka",45);
		System.out.println(s1);
		Student s2= new Student(18,"virate",46);
		System.out.println(s2);
	}
	
}
