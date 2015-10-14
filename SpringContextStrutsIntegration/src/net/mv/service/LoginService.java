package net.mv.service;

public class LoginService {
	
	public boolean authenticate(String username){
		boolean loginSuccessful = true;
		System.out.println("In LoginService - " + username);
		return loginSuccessful;
	}
}
