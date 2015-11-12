package com.javalec.ex11;
import java.util.*;
public class _06_HashSetEx02 {
	public static void main(String args[]) {
		HashSet<_06_Student> hashSet = new HashSet<_06_Student>();
		
		// 매개변수가 있는 생성자를 호출해서 hashSet에 add한다.
		hashSet.add(new _06_Student("홍길동", 3));
		hashSet.add(new _06_Student("이순신", 6));
		hashSet.add(new _06_Student("장보고", 1));
		hashSet.add(new _06_Student("오승현", 4));
		
		
		System.out.println(hashSet.toString());

		
		//_06_Student student = new _06_Studnet("이순신", 6);
		//hashSet.remove(student);
		//hashSet : 데이터를 가리키고 있는 주소값을 정수화함
		// 삭제 안 됨 : 데이터를 가리키고 있는 주소값(hash)이 다르므로

		hashSet.remove(new _06_Student("이순신", 6));
		hashSet.remove(new _06_Student("오승현", 4));
		System.out.println(hashSet.toString());
		System.out.println(new _06_Student("오승현", 4).hashCode());
		System.out.println(new _06_Student("오승현", 4).hashCode());
	}
}

