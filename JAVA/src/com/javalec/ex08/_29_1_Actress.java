package com.javalec.ex08;

public class _29_1_Actress implements _29_1_Chef, _29_1_FireFighter, _29_1_PoliceOfficer {

	@Override
	public String catchCriminal() {
		return "범인을 잡을 수 있다.";
	}

	@Override
	public String canSearch() {
		return "잃어버린 물건을 찾을 수 있다.";
	}

	@Override
	public String outFire() {
		return "불을 끌 수 있다.";
	}

	@Override
	public String saveMan() {
		return "사람을 구할 수 있다.";
	}

	@Override
	public String makePizza() {
		return "피자를 만들 수 있다.";
	}

	@Override
	public String makeSpaghetti() {
		return "스파게티를 만들 수 있다.";
	}

}
