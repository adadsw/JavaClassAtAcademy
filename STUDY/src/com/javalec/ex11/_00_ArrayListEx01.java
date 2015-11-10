package com.javalec.ex11;

import java.util.ArrayList;

public class _00_ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("키위");
		list.add("복숭아");
		list.add("참외");
		list.add(2, "바나나");
		list.add(5, "멜론");
		list.set(1, "귤");
		list.set(6, "복숭아");
		list.remove(4);
		list.remove("키위");
		
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
		
		int index = list.indexOf("키위");
		System.out.println("index ==> " + index);
		
		System.out.println("=================");
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("사과");
		list2.add("머루");
		list2.add("앵두");
		list2.add("사과");
		list2.add("자두");
		
		index = list2.indexOf("사과");
		System.out.println("첫번째 사과 ==> " + index);
		
		int lastIndex = list2.lastIndexOf("사과");
		System.out.println("마지막 사과 ==> " + lastIndex);
	}

}
