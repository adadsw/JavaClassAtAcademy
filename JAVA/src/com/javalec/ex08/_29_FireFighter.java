package com.javalec.ex08;

public class _29_FireFighter implements _29_Actress {

	@Override
	public String abilityOne() {
		return "불을 끌 수 있다.";
	}

	@Override
	public String abilityTwo() {
		return "사람을 구할 수 있다";
	}

	public String toString() {
		return FIREFIGHTER;
	}
}
