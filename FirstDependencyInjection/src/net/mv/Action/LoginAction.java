package net.mv.Action;

import net.mv.Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Registers LoginAction as a spring bean
 */
@Component
public class LoginAction {
	
	@Autowired
	LoginService loginService;
	
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	
	public void myExecuteMethod() {	
		System.out.println("In loginAction!");
		loginService.auth();
		
	}

	
	
	/*
	 * Constructors Spring
	 */
//	public LoginAction(LoginService loginService) {
//		super();
//		this.loginService = loginService;
//	}

	


}
