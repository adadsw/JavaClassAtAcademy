package com.javalec.ex11;

import java.util.Iterator;
import java.util.Vector;

public class _02_VectorEx01 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.addElement("사과");
		vector.addElement("배");
		vector.addElement("복숭아");
		vector.add("참외");
//		vector.add(new Integer(344444));

		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println();
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
