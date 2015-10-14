package net.mv.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import net.mv.model.Calculator;
import net.mv.service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcController {

	@Autowired
	CalculatorService calculatorService;
	/*
	 * Method to direct to calculator.jsp on get request 
	 */

	@RequestMapping(value="/calculator", method=RequestMethod.GET)
	public String directToCalculator(ModelMap map) {
		map.addAttribute("calculator", new Calculator());
		
		return "calculator";
	}
	
	/*
	 * Method to direct to operations.jsp on ??? request
	 */
	@RequestMapping(value="/operation", method=RequestMethod.POST)
	public String directToOperation(@Valid Calculator calculator, BindingResult result, HttpServletRequest req){
		if (result.hasErrors())
			return "calculator";
		HttpSession session = req.getSession();
		calculator = calculatorService.handleCalculation(calculator);
		List<Calculator> calcResultList = (List<Calculator>) session.getAttribute("calcResultList");
		
		if (calcResultList == null)
			calcResultList = new ArrayList<Calculator>();
		
		calcResultList.add(calculator);
		session.setAttribute("calcResultList", calcResultList);
		
		
		return "operation";
	}
	
	
}
