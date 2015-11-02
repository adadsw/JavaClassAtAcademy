package com.javalec.ex08;

public class _27_InterfaceClass implements _27_InterfaceEx1, _27_InterfaceEx2, _27_InterfaceEx3 {
		@Override
		public String getStr() {
			System.out.println("getStr() 호출");
			System.out.println(CONSTNAMT_STRING);
			return null;
		}
		
		@Override
		public void calculate() {
			System.out.println("calculate() 호출");
			System.out.println(CONSTANT_NUM);
		}
		
		@Override
		public void getTotal() {
			System.out.println("getTotal() 호출");
			System.out.println(KOR + ENG + MAT);
		}

}
