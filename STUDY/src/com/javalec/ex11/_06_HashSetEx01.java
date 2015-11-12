package com.javalec.ex11;
import java.util.*;
public class _06_HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str2");
		hashSet.remove("str1");
		
		System.out.println(hashSet.toString());
		System.out.println(hashSet);
		
		for (int i = 0; i < hashSet.size(); i++) {
			Object[] obj = hashSet.toArray();
			System.out.println(obj[i]);
		}
		System.out.println();
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	

}
