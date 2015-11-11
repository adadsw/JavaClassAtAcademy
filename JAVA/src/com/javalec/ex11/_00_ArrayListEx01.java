/* 
 * 자료구조 : 데이터를 효율적으로 사용할 수 있도록 구조를 만들어서 저장해 둔 것
 * 
 * Collection API
 * 1. 정의 : 다양한 자료구조를 자바클래스로 객체화한 것
 * 			 다수의 데이터를 저장할 수 있는 클래스(ArrayList, HashMap...)
 * ArrayList
 * 1. 특징 : 데이터가 순서가 있고, 중복이 허용된다.
 * 2. 추가 : list.add(추가할 위치index, 값)
 * 			==> 중간에 데이터를 삽입하면 원래 그 위치에 있던 데이터로부터 리스트의 마지막까지 데이터는 한 칸씩 이동
 * 			list.add(값) ==> 순서대로 삽입된다.
 * 3. 교체 : list.set(교체할 위치index, 값)
 * 			==> 기존 데이터를 다른 데이터로 교체하고자 할 때
 * 4. 삭제 : list.remove(삭제할 위치 index), list.remove(삭제할 값)
 * 			==> 해당 데이터가 삭제되면 뒤에 있는 데이터들은 한 칸 씩 앞으로 이동
 * 5. 검색 : int index = list.indexOf(검색할 값)
 * 			==> 리스트에서 검색할 값과 똑같은 값을 갖는 첫 번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
 * 				검색할 값과 같은 데이터가 없으면 -1을 리턴한다.
 * 			 int index = list.lastIndexOf(검색할 값)
 * 			==> 리스트에서 검색할 값과 똑같은 값을 갖는 마지막 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
 * 				검색할 값과 같은 데이터가 없으면 -1을 리턴한다.
 * 6. list.clear(); // list2의 데이터 전체 삭제
 * 7. list = null;	// 주소값 = null;	java.lang.NullPointerException 발생
 */

package com.javalec.ex11;

import java.util.ArrayList;

public class _00_ArrayListEx01 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("키위");
		list.add("복숭아");
		list.add("참외");
		list.add(2, "바나나"); // list.add(추가할 위치 index, 값)
		list.add(5, "멜론");
		list.set(1, "귤"); // list.set(교체할 위치 index, 값)
		list.set(6, "복숭아");
		list.remove(4); // list.remove(삭제할 위치 index)
		list.remove("키위"); // list.remove(삭제할 값)

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		int index = list.indexOf("키위");
		System.out.println("index ==> " + index);

		System.out.println("===============");

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
		
		System.out.println(list2.size());
		
		// list2의 데이터 전체삭제
//		list2.clear();
		list2 = null;
		for (String str : list2)
			System.out.println(str);
	}
}

/*
 * 포도 귤 바나나 멜론 복숭아 index ==> -1 =============== 첫번째 사과 ==> 0 마지막 사과 ==> 3
 */