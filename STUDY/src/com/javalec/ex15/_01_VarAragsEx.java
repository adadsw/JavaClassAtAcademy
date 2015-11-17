package com.javalec.ex15;

public class _01_VarAragsEx {
	public static void main(String[] args) {
		Varargs var = new Varargs();
		
		var.test("고소영", "장동건");
		var.test2("김태희", 1,2,3,4);
	}

}

class Varargs {

	public void test(String ... s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
		
		public void test2(String s, int ...n) {
			System.out.println(s);
			
			for(int i = 0; i < n.length; i++) {
				System.out.println(n[i]);
		}
	}
}