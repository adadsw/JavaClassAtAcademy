/*
 * LinkedList 클래스의 기본적인 사용방법은 ArrayList클래스와 동일하다.
 * 차이점
 * 정의
 * 1. LinkedList는 불연속적으로 존재하는 데이터를 연결
 * 2. 삽입
 * LinkedList는 데이터 삽입위치의 앞뒤에 있는 데이터의 상호 링크를 끊고,
 * 삽입할 데이터를 원래 링크를 맺고 있던 데이터와 한쪽 씩 연결하는 방식으로 데이터가 삽입된다.
 * 2. 삭제
 * LinkedList는 삭제되는 데이터와 인접한 데이터들의 링크가 끊어졌다가, 두 데이터가 
 * 직접 연결되는 방식으로 삭제가 된다.
 * 3. 삽입과 삭제가 빈번한 경우 ArrayList보다 더 빠르다.
 * 4. 검색의 경우 처음부터 순차적으로 접근해서 검색하므로, 배열의 인덱스를 이용하여 데이터의 위치를 
 * 바로 찾을 수 있는 ArrayList가 더 빠르다.
 * 5. 검색의 경우 처음부터 순차적으로 접근해서 검색하므로, 배열의 인덱스를 이용하여 데이터의 위치를
 * 바로 찾을 수 있는 ArrayList가 더 빠르다.
 */


package com.javalec.ex11;

import java.util.Iterator;
import java.util.LinkedList;

public class _01_LinkedListEx01 {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		list.set(0, "오렌지");
		list.remove("키위");
		
		for (String str: list)
			System.out.println(str);
		
		list.clear();
		
		// Iterator를 이용한 데이터의 순차접근
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		System.out.println();
		Iterator<String> iterator = list.iterator();
		System.out.println("Iterator를 이용한 순차접근");
		while(iterator.hasNext()) {
			String str =iterator.next();
			System.out.println(str);
		}
		
	}

}
