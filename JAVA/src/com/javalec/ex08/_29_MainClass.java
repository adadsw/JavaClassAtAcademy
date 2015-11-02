package com.javalec.ex08;

public interface _29_MainClass {
	public static void main(String[] args) {
		_29_Actress act[] = new _29_Actress[3];
		act[0] = new _29_PoliceOfficer();
		act[1] = new _29_FireFighter();
		act[2] = new _29_Chef();
		
		for(int cnt = 0; cnt < act.length; cnt++) {
			System.out.println(act[cnt] + "'s ablity");
			System.out.println(act[cnt].abilityOne());
			System.out.println(act[cnt].abilityTwo());
			System.out.println();
		}
	}

}
