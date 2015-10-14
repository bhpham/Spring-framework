package net.mv.service;

import net.mv.model.Calculator;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
	
	public Calculator handleCalculation(Calculator calc) {
		if (calc.getOp().equals("add")) {
			calc.setResult(add(calc));
		} else if (calc.getOp().equals("subtract")) {
			calc.setResult(subtract(calc));
		} else if (calc.getOp().equals("divide")) {
			calc.setResult(divide(calc));
		} else
			calc.setResult(multiply(calc));
		
		return calc;
	}
	
	public double add(Calculator calc) {
		return  Double.parseDouble(calc.getNum1()) + Double.parseDouble(calc.getNum2());
	}
	
	public double subtract(Calculator calc) {
		return  Double.parseDouble(calc.getNum1()) - Double.parseDouble(calc.getNum2());
	}
	
	public double divide(Calculator calc) {
		return  Double.parseDouble(calc.getNum1()) / Double.parseDouble(calc.getNum2());
	}
	
	public double multiply(Calculator calc) {
		return  Double.parseDouble(calc.getNum1()) * Double.parseDouble(calc.getNum2());
	}
}
