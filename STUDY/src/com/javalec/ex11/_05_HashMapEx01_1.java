package com.javalec.ex11;
import java.util.*;
public class _05_HashMapEx01_1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("소지섭", "1");
		map.put("장동건", "2");
		map.put("박서준", "3");
		map.put("공유", "4");
		
		System.out.println(map.get("소지섭"));
		System.out.println(map.get("장동건"));
		System.out.println(map.get("박서준"));
		System.out.println(map.get("공유"));
	}
}