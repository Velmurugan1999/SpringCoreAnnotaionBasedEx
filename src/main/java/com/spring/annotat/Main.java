package com.spring.annotat;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static Logger logger=Logger.getLogger("main1");
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		Student st1=context.getBean(Student.class);
		st1.setId(11);
		st1.setDepartment("Civil");
		st1.setName("Vivek");
		logger.setLevel(Level.ALL);
		System.out.println("Singleton Bean..............");
		logger.info("Student 1\n"+st1.getId()+"  Name:"+st1.getName()+"   department:"+st1.getDepartment()+"\n");
		Student st2=context.getBean(Student.class);
		logger.info("Student 2\n"+st2.getId()+"  Name:"+st2.getName()+"   department:"+st2.getDepartment()+"\n");
		
		System.out.println("Prototype Bean..............");
		Car car1=context.getBean(Car.class);
		car1.setModelno(1211);
		car1.setBrand("Volvo");
		car1.setColour("Black");
		car1.setBreaking("ABS");
		logger.info("Car 1\n"+"Model:"+car1.getModelno()+"   Brand:"+car1.getBrand()+"   Colour:"+car1.getBreaking()+"\n>>>Object:"+car1.getcount());
		
		Car car2=context.getBean(Car.class);
		car1.setModelno(1233);
		car1.setBrand("Maruti");
		car1.setColour("White");
		car1.setBreaking("Drum");
		logger.info("Car 2\n"+"Model:"+car2.getModelno()+"   Brand:"+car2.getBrand()+"   Colour:"+car2.getBreaking()+"\n>>>Object:"+car2.getcount());
		
	}

}
