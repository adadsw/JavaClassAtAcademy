package com.javalec.ex08;

public class _29_2_PoliceOfficer implements _29_2_Actress {
	
	public static final String POLICE = "PoliceOfficer";

	@Override
	public void catchCriminal() {
		System.out.println("범인을 잡을 수 있다.");
	}

	@Override
	public void canSearch() {
		System.out.println("잃어버린 물건을 찾을 수 있다.");
	}

	@Override
	public void outFire() {
	}

	@Override
	public void saveMan() {
	}

	@Override
	public void makePizza() {
	}

	@Override
	public void makeSpaghetti() {
	}
}
