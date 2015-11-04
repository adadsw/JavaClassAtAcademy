package com.javalec.ex08;
// Toy는 Interface로서 MoveArmLeg과 Missile 그리고 Light에게 상속
// 클래스 Teddy, Plane, Mazinga는 위에 나열된 기능을 implements 하여 기능을 부여

public class _30_MainClass {
	public static void main(String[] args) {
		
		_30_Toy toy[] = new _30_Toy[3];
		toy[0] = new _30_Teddy();
		toy[1] = new _30_Mazinga();
		toy[2] = new _30_Plane();
		
		// 각 장난감 객체에 implements 받은 기능을 instanceof로 분별하여 출력
		for (int i = 0; i < toy.length; i++) {
			System.out.println(toy[i] + "입니다.");
			if (toy[i] instanceof _30_MoveArmLeg)
				System.out.println("팔다리를 움직일 수 있습니다.");
			if (toy[i] instanceof _30_Light)
				System.out.println("불빛을 발사할 수 있습니다.");
			if (toy[i] instanceof _30_Missile)
				System.out.println("미사일을 발사할 수 있습니다.");
			System.out.println("============================");
		}
	}
}
