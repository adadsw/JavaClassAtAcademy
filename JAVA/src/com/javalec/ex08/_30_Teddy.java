package com.javalec.ex08;

public class _30_Teddy implements _30_MoveArmLeg {
	_30_Teddy() {
		System.out.println(this + "입니다.");
		canMoveArmLeg();
		System.out.println("============================");
	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public String toString() {
		return "곰돌이";
	}
}
