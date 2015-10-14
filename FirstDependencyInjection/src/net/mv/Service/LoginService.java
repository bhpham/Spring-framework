package net.mv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.mv.Dao.LoginDAO;

/*
 * Registers LoginService as a spring bean
 */
@Component
public class LoginService {
	
	@Autowired
	LoginDAO loginDao;

	public void setLoginDao(LoginDAO loginDao) {
		this.loginDao = loginDao;
	}


	public void auth() {
	
		System.out.println("In LoginService");
		
		//loginDao = new LoginDAO();
		loginDao.retrieveUser();
	}
}
