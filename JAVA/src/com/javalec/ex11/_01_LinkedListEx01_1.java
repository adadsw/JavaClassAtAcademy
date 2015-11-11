package com.javalec.ex11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// 망고 파인애플 바나나
public class _01_LinkedListEx01_1 {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("망고");
		alist.add("파인애플");
		alist.add("바나나");
		
		Iterator<String> iterator = alist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		LinkedList<String> llink = new LinkedList<String>();
		llink.add("망고");
		llink.add("파인애플");
		llink.add("바나나");
		
		Iterator<String> iterator2 = llink.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
