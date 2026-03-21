package com.pkg.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(7);
		stack.push(6);
		stack.push("A");
		stack.push(null);
		stack.push("B");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.search("C"));
		System.out.println(stack.search(6));
	}
}
