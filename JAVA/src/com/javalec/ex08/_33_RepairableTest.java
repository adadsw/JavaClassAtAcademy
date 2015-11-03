package com.javalec.ex08;

public class _33_RepairableTest {
	public static void main(String[] args) {
		SCV scv = new SCV();
		scv.repair(new Tank());
		scv.repair(new Dropship());
//		scv.repair(new Marine());
	}
}

class Unit22 {
	int hitPoint;
	final int MAX_HP;

	Unit22(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit22 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit22 {
	AirUnit(int hp) {
		super(hp);
	}
}

interface Repairable {
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		// if (r instanceof Unit22) {
		Unit22 u = (Unit22) r;
		while (u.hitPoint != u.MAX_HP) {
			/* Unit의 HP를 증가시킨다. */
			u.hitPoint++;
		}
		System.out.println(u + "의 수리가 끝났습니다.");
		// }
	}
}
