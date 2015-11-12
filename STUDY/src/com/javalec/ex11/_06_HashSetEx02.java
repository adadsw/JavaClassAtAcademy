package com.javalec.ex11;
import java.util.*;
public class _06_HashSetEx02 {
	public static void main(String[] args) {
		HashSet<_06_Student> hashSet = new HashSet<_06_Student>();
		
		hashSet.add(new _06_Student("홍길동", 3));
		hashSet.add(new _06_Student("이순신", 6));
		hashSet.add(new _06_Student("장보고", 1));
		hashSet.add(new _06_Student("오승현", 4));
		
		System.out.println(hashSet.toString());
		
		hashSet.remove(new _06_Student("이순신", 6));
		hashSet.remove(new _06_Student("오승현", 4));
		System.out.println(hashSet.toString());
	}
}
