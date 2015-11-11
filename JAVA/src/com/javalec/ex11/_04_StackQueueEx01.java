/*
 * Queue
 * 1. 특징 : FIFO (First In First Out) 구조로 되어 있다.
 * 			가장 처음에 넣었던 데이터를 가장 먼저 꺼내는 입출력방식
 * 2. offer() : 데이터를 집어넣는다.
 * 3. poll() : 데이터를 꺼낸다.
 * 4. isEmpty() : 데이터가 비어있는지 여부
 */

package com.javalec.ex11;
import java.util.*;

public class _04_StackQueueEx01 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		System.out.println("== Stack ==");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		Queue que = new LinkedList();
		que.offer(0);
		que.offer(1);
		que.offer(2);
		System.out.println("== Queue ==");
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		
	}

}
