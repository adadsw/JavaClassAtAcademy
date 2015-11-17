package com.javalec.ex15;

public class _01_VarAragsEx {
	public static void main(String[] args) {
		
		/*  JDK 5.0 이전 버전에서는 메서드 호출시 인자의 수가 반드시 일치해야 호출이 가능했다.
		 *  VarArgs는 인자의 수를 동적으로 처리할 수 있다.
		 *  유연성을 제공한다.
		 *  2. 방법 : 메서드의 인자로 (Tpye ... 변수)로 지정한다.
		 *  			컴파일시 인자로 넘어온 개수만큼 배열이 생성된다.
		 */
		Varargs var = new Varargs();
		
		var.test("고소영", "장동건");
		var.test2("김태희", 1, 2, 3, 4);
		
	}

}

class Varargs {
	
	public void test(String ... s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	public void test2(String s, int ... n) {
		System.out.println(s);
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}