package com.spring.annotat;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
	public static int count=0;
	private int modelno;
	private String brand;
	private String colour;
	private String breaking;
	public Car() {
		count++;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBreaking() {
		return breaking;
	}
	public void setBreaking(String breaking) {
		this.breaking = breaking;
	}
	public int getcount() {
		return count;
	}
	
}
