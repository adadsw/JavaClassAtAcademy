package com.brain.ch9;

import java.util.StringTokenizer;

public class StringTokenizerExampleEx9_5 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("고슴도치, 앵무새| 토끼", ",| ");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
