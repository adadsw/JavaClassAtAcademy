package com.javalec.ex11;
import java.util.*;
public class _05_HashMapEx01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("소지섭", "111-1111");
		map.put("장동건", "222-2222");
		map.put("박서준", "333-3333");
		map.put("공유", "444-4444");
		
		System.out.println(map.get("소지섭"));
		System.out.println(map.get("장동건"));
		System.out.println(map.get("박서준"));
		System.out.println(map.get("공유"));
	}
}
