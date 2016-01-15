package com.javalec.ch02_1;

public class MyCalculator {
	
	Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator(){}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.substraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplation(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
}
