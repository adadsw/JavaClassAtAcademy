package com.javalec.ex08;

public class _30_Plane implements _30_Missile, _30_Light {

	_30_Plane() {
		System.out.println(this + "입니다.");
		canLight();
		canMissile();
		System.out.println("============================");
	}

	@Override
	public void canLight() {
		System.out.println("불빛을 발사할 수 있습니다.");

	}

	@Override
	public void canMissile() {
		System.out.println("미사일을 발사할 수 있습니다.");
	}

	@Override
	public String toString() {
		return "비행기";
	}
}
