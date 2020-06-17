package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Prashanth;
import com.app.service.PrashanthService;

public class PrashanthTest {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		PrashanthService service=ac.getBean("prashanthServiceImpl",PrashanthService.class);
		
	   service.savePrashanth(new Prashanth(14,"pra",4.4,"Banglore"));
	   service.savePrashanth(new Prashanth(12,"Bhanu",4.5,"Nellore"));
	   service.savePrashanth(new Prashanth(13,"harshith",4.6,"Kavali"));
	   
	   Prashanth p=new Prashanth();
	   p.setPrsId(12);
	   service.deletPrashanth(12);
	   System.out.println(1+ "deleted");
	    
	   service.getAllPrashanth().forEach(System.out::println);
		 System.out.println("save date sucessfully");
		 
	}
	 
	
	
	
}
