package com.javalec.ex08;

public class _29_Chef implements _29_Actress {

	@Override
	public String abilityOne() {
		return "피자를 만들 수 있다";
	}

	@Override
	public String abilityTwo() {
		return "스파게티를 만들 수 있다";
	}
	
	public String toString() {
		return CHEF;
	}
}
