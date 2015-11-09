package com.javalec.ex10;

import java.util.StringTokenizer;

public class _42_StringTokenizerEx2 {
	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,80,90,70|3,고아라,100,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("-----");
		}
	}

}
