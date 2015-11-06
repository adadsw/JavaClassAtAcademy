package com.javalex.ex09;

public class ExceptionEx12 {
	public static void main(String[] args) {
		try {
			int result = subtract(100, 5);
			System.out.println(result);
		} catch (InvalidInputException e) {
			System.err.println(e.getMessage());
		}
	}
	static int subtract(int a, int b) throws InvalidInputException {
		if (a < b)
			throw new InvalidInputException();
		return a - b;
	}

}
class InvalidInputException extends Exception {
	InvalidInputException() {
		super("잘못된 입력입니다.");
	}
}
