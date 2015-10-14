package net.mv.service;

import net.mv.dao.LoginDao;
import net.mv.dao.LoginDaoInterface;

public class LoginService {
	
	LoginDaoInterface loginDao;
	
	
	public void setLoginDao(LoginDaoInterface loginDao) {
		this.loginDao = loginDao;
	}



	public void auth() { 
		System.out.println("In LoginService");
		loginDao.retrieveUser();
		
		/*
		 * Down Casting example
		 */
//		((LoginDao) loginDao).someOtherMethod();
	}
}
