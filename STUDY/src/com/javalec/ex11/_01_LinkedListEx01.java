package com.javalec.ex11;

import java.util.*;

public class _01_LinkedListEx01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		list.set(0, "오렌지");
		list.remove("키위");
		
		for (String str : list)
			System.out.println(str);
		
		list.clear();
		
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		Iterator<String> iterator = list.iterator();
		System.out.println("Iterator를 이용한 순차접근");
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
