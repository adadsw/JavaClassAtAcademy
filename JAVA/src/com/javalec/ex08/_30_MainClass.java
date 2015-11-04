package com.javalec.ex08;
// Toy는 Interface로서 MoveArmLeg과 Missile 그리고 Light에게 상속

// 클래스 Teddy, Plane, Mazinga는 위에 나열된 기능을 implements 하여 기능을 부여

public class _30_MainClass {
	public static void main(String[] args) {

		_30_Toy toy[] = { new _30_Teddy(), new _30_Mazinga(), new _30_Plane() };

		System.out.println(toy[0] + "입니다.");
		((_30_Teddy) toy[0]).canMoveArmLeg();
		System.out.println("-----------------------------");
		System.out.println(toy[1] + "입니다.");
		((_30_Mazinga) toy[1]).canMissile();
		((_30_Mazinga) toy[1]).canMoveArmLeg();
		System.out.println("-----------------------------");
		System.out.println(toy[2] + "입니다.");
		((_30_Plane) toy[2]).canLight();
		((_30_Plane) toy[2]).canMissile();
		System.out.println("-----------------------------");
	}
}
