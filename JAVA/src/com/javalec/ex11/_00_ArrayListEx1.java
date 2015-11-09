package com.javalec.ex11;

import java.util.ArrayList;

public class _00_ArrayListEx1 {
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("쥬스");
		list.add("스테이크");
		list.add("아웃백");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
