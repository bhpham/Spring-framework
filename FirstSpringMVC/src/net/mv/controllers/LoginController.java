package net.mv.controllers;

import javax.validation.Valid;

import net.mv.model.Employee;
import net.mv.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/employee")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/dog", method=RequestMethod.POST)
	public String someMethod(@Valid Employee employee, BindingResult result){
		/*
		 * Login authentication
		 */
		System.out.println("I'm in someMethod()");
		System.out.println("Username: " + employee.getUsername());
		
		//loginService.authentication();
		if (result.hasErrors()) 
			return "login";
		else
			return "homepage";
		
	}
	
	/*
	 * Forward to /WEB-INF/pages/login.jsp
	 */
	@RequestMapping(method=RequestMethod.GET, value="/fish")
	public String goToLoginPage(ModelMap model){
		System.out.println("I'm in goToLoginPage() and this should be a GET request");
		
		
	
	/*
	 * Perform binding - specify the JSP form will represent the Employee object
	 */
		model.addAttribute("employee", new Employee());
		
		return "login";
	}
	
}
