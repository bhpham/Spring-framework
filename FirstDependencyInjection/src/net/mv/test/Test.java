package net.mv.test;

import net.mv.Action.LoginAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
		public static void main(String[] args) {
			
//			LoginAction loginAction = new LoginAction();
//			loginAction.myExecuteMethod();
			
			/*
			 * Step 1: "Load" Application Context
			 */
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("net/mv/resources/applicationContext.xml");
			
			/* 
			 * Step 2: Get LoginAction spring bean 
			 */ 
			LoginAction loginAction = (LoginAction) applicationContext.getBean("loginAction");
	
	
			/*
			 * Step 3: Call loginAction.myExecuteMethod();
			 */
			loginAction.myExecuteMethod();
			
		}
}
