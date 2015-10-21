package com.javalec.ex06;

public class _10_ParameterTest2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x " + d.x);
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);
	}
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x =" + d.x);
	}

}

/*main() : x 10
change() : x =1000
After change(d)
main() : x = 1000
*/