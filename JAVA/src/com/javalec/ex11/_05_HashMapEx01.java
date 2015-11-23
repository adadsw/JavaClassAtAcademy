/*
 * HashMap
 * 1. 정의 : 해시함수 (hash function)를 이용해서 해시테이블에 저장하고 검색한다.
 * 2. 특징 : 
 * 		1) 해싱기법을 사용해서 데이터를 저장하기 때문에 많은 양의 데이터를 검색할 대 성능이 뛰어나다.
 * 		2) HashMap은 Map 인터페이스를 구현하였으며, 데이터를 키와 값의 쌍으로 저장한다. 
 * 			key - 유일해야 한다.
 * 			값 - 데이터의 중복을 허용한다.
 * 		3) key를 이용하여 value를 참조할 수 있다.
 * 3. 저장 : put(key, value)
 * 4. 검색 : get(key)
 * 5. 삭제 : remove(key)
 * 6. Iterator<Integer> iterator = hashMap.keySet().iterator();
 */
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
