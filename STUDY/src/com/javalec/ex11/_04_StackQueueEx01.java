package com.javalec.ex11;
import java.util.*;
public class _04_StackQueueEx01 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		System.out.println("== Stack ==");
		while (!stack.isEmpty())
			System.out.println(stack.pop());
		
		Queue que = new LinkedList();
		que.offer(0);
		que.offer(1);
		que.offer(2);
		System.out.println("== Queue ==");
		while (!que.isEmpty())
			System.out.println(que.poll());
	}
}
