package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {


		//setter injection
		
//		Travel tr1= new Travel();
//		
//		tr1.setV(new Bike());
//		
//		tr1.journey();
		
		//constructor injection
		
//		Travel tr=new Travel(new Bike());
//		
//		tr.journey();
		
		ApplicationContext acc= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Travel obj= acc.getBean("tr", Travel.class);
		
		obj.journey();
		
	}

}
