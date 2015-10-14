package net.mv.test;

import net.mv.model.Event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("net/mv/resources/applicationContext.xml");
		
		Event event = (Event) applicationContext.getBean("event");
		
		for (int i = 0; i < 5; i++) {
			event.playConcert();
			System.out.println();
			event.playComedyShow();
		}

		
	}
}
