package com.javalec.ex11;

import java.util.ArrayList;

public class _00_ArrayListEx1_1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("바나나");
		list.add("자몽");
		list.add("호두");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
