package com.javalec.ex09;

public class InvalidRandomException extends Exception {
	InvalidRandomException() {
		super("재고가 부족합니다.");
	}
}
