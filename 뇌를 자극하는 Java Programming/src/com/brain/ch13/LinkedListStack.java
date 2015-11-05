package com.brain.ch13;
import java.util.*;
public class LinkedListStack {
	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList();
		stack.addFirst(new Integer(1));
		stack.addFirst(new Integer(5));
		stack.addFirst(new Integer(7));
		while(!stack.isEmpty()) 
			System.out.println(stack.removeFirst());
		
	}

}
