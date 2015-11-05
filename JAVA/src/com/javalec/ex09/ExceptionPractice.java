package com.javalec.ex09;

public class ExceptionPractice {
	public static void main(String[] args) {
		try {
			int result = chkAmount(100);
			System.out.println(result);
		} catch (InvalidRandomException e) {
			System.err.println(e.getMessage());
		}
		
		
	}
	static int chkAmount(int stock) throws InvalidRandomException {
		int stockAmount = stock;
		if (stockAmount < 0)
			throw new InvalidRandomException();
		else 
			return stockAmount;
	}

}
