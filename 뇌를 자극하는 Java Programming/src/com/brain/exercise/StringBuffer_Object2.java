package com.brain.exercise;

public class StringBuffer_Object2 {
	public static void main(String[] args) {
		StringBuffer obj;
		obj = new StringBuffer("Hey, Java");
		obj.replace(1, 3, "i");
		System.out.println(obj);
	}

}
