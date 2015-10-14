package net.mv.Dao;

import org.springframework.stereotype.Component;


/*
 * Registers LoginDao as a spring bean
 */
@Component
public class LoginDAO {

	public void retrieveUser() {
		System.out.println("In LoginDAO!");
		
	}
}
