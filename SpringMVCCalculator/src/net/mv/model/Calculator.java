package net.mv.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Calculator {
	
	@NotEmpty(message = "Number 1 is required!")
	private String num1;
	
	@NotEmpty(message = "Number 2 is required!")
	private String num2;
	
	private Double result;
	
	@NotEmpty(message = "Operation is required")
	private String op;

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
	
	
	
}
