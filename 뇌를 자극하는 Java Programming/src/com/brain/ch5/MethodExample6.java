package com.brain.ch5;

public class MethodExample6 {
	public static void main(String args[]) {
		PhysicalInfo obj;
		obj = new PhysicalInfo("해리", 10, 132.01f, 35.0f);
		printPhysicalInfo(obj);

		obj.update(11, 145.0f, 45.0f);
		printPhysicalInfo(obj);

		obj.update(12, 157.0f);
		printPhysicalInfo(obj);

		obj.update(13);
		printPhysicalInfo(obj);
	}

	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("나이:" + obj.age);
		System.out.println("키:" + obj.height);
		System.out.println("몸무게:" + obj.weight);
		System.out.println();
	}

}

/*이름:해리
나이:10
키:132.01
몸무게:35.0

이름:해리
나이:11
키:145.0
몸무게:45.0

이름:해리
나이:12
키:157.0
몸무게:45.0

이름:해리
나이:13
키:157.0
몸무게:45.0*/

