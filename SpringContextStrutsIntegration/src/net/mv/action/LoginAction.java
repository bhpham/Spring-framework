package net.mv.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mv.service.LoginService;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action{

	LoginService loginService;
	
	
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}


	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		System.out.println("In LoginAction");
		DynaActionForm dynaForm = (DynaActionForm) form;
		String username = dynaForm.getString("username");
		
		//loginService = new LoginService();
		boolean loginSuccessful = loginService.authenticate(username);
		
		
		return mapping.findForward("nextView");
	}
}
