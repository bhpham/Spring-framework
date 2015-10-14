package net.mv.test;

import net.mv.service.SchoolService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("In Main");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SchoolService schoolService = (SchoolService) applicationContext.getBean("schoolService");
		
		schoolService.insertSchool(1, "Washington State Univeristy");
		
	}
}
