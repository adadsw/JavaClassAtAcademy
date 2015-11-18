package com.javalec.ex08;

public class _30_Mazinga implements _30_Missile, _30_MoveArmLeg {
	_30_Mazinga() {
		System.out.println(this + "입니다.");
		canMoveArmLeg();
		canMissile();
		System.out.println("============================");
	}

	@Override
	public String toString() {
		return "마징가";
	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void canMissile() {
		System.out.println("미사일을 발사할 수 있습니다.");
	}
}
