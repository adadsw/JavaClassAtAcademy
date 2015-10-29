package com.brain.ch9;

import java.util.StringTokenizer;

public class StringTokenizerExampleEx9_4 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(
				"사과=10|초콜렛=3|샴페인=1", "=|", true);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();

			if (token.equals("="))
				System.out.print("\t");
			else if (token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);

		}
	}
}
