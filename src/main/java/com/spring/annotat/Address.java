package com.spring.annotat;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int doorno;
	private String streetName;
	private String city;
	private int pincode;
	public Address() {
		
	}
	public Address(int doorno, String streetName, String city, int pincode) {
		super();
		this.doorno = doorno;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void init() {
		System.err.println("Address bean is Initiated........");
	}
	public void destroy() {
		System.err.println("Address bean is going to destroy...........");
	}
}
