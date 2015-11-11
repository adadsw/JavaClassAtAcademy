/*
 * Stack
 * 1. 특징 : 데이터를 한 쪽에서만 저장, 삭제할 수 있다.
 * 			LIFO (Last In First Out) 구조로 되어있다.
 * 2. push() : 데이터를 집어 넣는다.
 * 3. pop() : 데이터를 꺼낸다.
 * 4. isEmpty() : 스택이 비어있는지  
 */

package com.javalec.ex11;

import java.util.Stack;

public class _03_StackEx01 {
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push("보라카이");
		stack.push("하와이");
		stack.push("독일");
		stack.push("싱가폴");
		stack.push("파리");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
