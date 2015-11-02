package com.javalec.ex08;

public class _29_PoliceOfficer implements _29_Actress {

	@Override
	public String abilityOne() {
		return "범인을 잡을 수 있다.";
	}

	@Override
	public String abilityTwo() {
		return "잃어버린 물건을 찾을 수 있다.";
	}
	
	public String toString() {
		return POLICE;
	}
	
}
