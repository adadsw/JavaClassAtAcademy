package com.brain.ch9;

public class LongLongString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (String str : args)
			sb.append(str);
		System.out.println(sb);
	}

}

// 입력하는 문자들을 하나의 문자열로 출력