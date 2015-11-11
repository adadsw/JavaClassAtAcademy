package com.javalec.ex11;
import java.util.*;

public class _05_HashMapEx02 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		hashMap.put(5, "str5");
		System.out.println(hashMap.get(2));
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		hashMap.put(5, "str5");
		System.out.println(hashMap.toString());
		
		System.out.println("===Iterator를 이용한 출력====");
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println();
		
		HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
		hashMap2.put("홍길동", 300);
		hashMap2.put("김씨", 250);
		hashMap2.put("이씨", 200);
		hashMap2.put("서씨", 267);
		
		Iterator<String> iterator2 = hashMap2.keySet().iterator();
		while (iterator.hasNext()) {
			String str = iterator2.next();
			System.out.println(str + " : " + hashMap2.get(str));
		}
	}

}
