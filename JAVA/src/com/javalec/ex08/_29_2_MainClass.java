package com.javalec.ex08;

public class _29_2_MainClass {
	public static void main(String[] args) {
		_29_2_Actress actor[] = new _29_2_Actress[3];
		actor[0] = new _29_2_PoliceOfficer();
		actor[1] = new _29_2_FireFighter();
		actor[2] = new _29_2_Chef();

		for (int i = 0; i < actor.length; i++) {
			actor[i].catchCriminal();
			actor[i].canSearch();
			actor[i].outFire();
			actor[i].saveMan();
			actor[i].makePizza();
			actor[i].makeSpaghetti();

		}

	}

}
