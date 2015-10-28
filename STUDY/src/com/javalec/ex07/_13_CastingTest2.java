package com.javalec.ex07;

public class _13_CastingTest2 {
	public static void main(String[] args) {
		Car3 car = new Car3();
		Car3 car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
				
	}

}
