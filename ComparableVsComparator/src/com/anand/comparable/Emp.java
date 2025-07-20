package com.anand.comparable;

public class Emp implements Comparable<Emp> {
     
	private String name;
	private String phone;
	private int id;
	
	
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	public Emp(String name, String phone, int id) {
		this.name = name;
		this.phone = phone;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	//toString() method is the method of the object class which is used to print the info of object in the readable format
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", id=" + id + "]";
	}

	
	
	
	
	
	
}
