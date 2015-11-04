package com.javalec.ex08;

public class _37_InterfaceExample3 {
	public static void main(String[] args) {
		
	}
	static void printState(_37_SeparateVolume obj) {
		if (obj.state == _37_Lendable.STATE_NORMAL) {
			System.out.println("---------------------");
			System.out.println("대출상태 : 대출가능");
			System.out.println("---------------------");
		}
		if (obj.state == _37_Lendable.STATE_BORROWED) {
			System.out.println("---------------------");
			System.out.println("대출상태: 대출중");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
}
