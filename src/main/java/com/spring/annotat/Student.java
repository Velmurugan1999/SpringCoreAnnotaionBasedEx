package com.spring.annotat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	private int id;
	private String name;
	private String department;
	@Autowired
	private Address address;
	
	public Student() {
		
	}
	public Student(int id, String name, String department, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void init() {
		System.err.println("Student bean is Initiated........");
	}
	public void destroy() {
		System.err.println("Student bean is going to destroy...........");
	}
	@Override
	public String toString() {
		return "ID:"+this.getId()+"   Name:"+this.getName()+"   Deparment:"+this.getDepartment()+
				"\n			Address:"+this.getAddress().getDoorno()+", "+this.getAddress().getStreetName()+
				", "+this.getAddress().getCity()+" - "+this.getAddress().getPincode();
				
	}
}
