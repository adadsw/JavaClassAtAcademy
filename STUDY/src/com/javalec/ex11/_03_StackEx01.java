package com.javalec.ex11;
import java.util.*;
public class _03_StackEx01 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("보라카이");
		stack.push("하와이");
		stack.push("독일");
		stack.push("싱가폴");
		stack.push("파리");
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
}
