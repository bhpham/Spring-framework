package net.mv.test;

import net.mv.service.LoginService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		//LoginService loginService = new LoginService();
		//loginService.auth();
		
		/*
		 * Goal 1: perform Autowiring w/o annotations
		 * 
		 * Goal 2: Prove that byName is better than byType
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("net/mv/resources/applicationContext.xml");
		
		LoginService loginService = (LoginService) applicationContext.getBean("myCoolLoginService");
		
		loginService.auth();
		
	}
}
