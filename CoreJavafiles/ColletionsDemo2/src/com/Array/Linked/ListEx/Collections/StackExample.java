package com.Array.Linked.ListEx.Collections;

import java.util.Stack;

public class StackExample {
//	 It is the Child Class of Vector.
//	 It is a Specially Designed Class for Last In First Out (LIFO) Order.

	public static void main(String[] args) {
		Stack<Integer> integers = new Stack<Integer>();
		integers.push(5);
		integers.push(4);
		integers.push(3);
		integers.push(2);
		integers.push(1);
		integers.push(0);

		System.out.println(integers.pop());// it returns the top element in the container stack
		System.out.println(integers.peek());// it returns the top of the element of the container stack
		System.out.println(integers.isEmpty());// it returns  is the stack is empty or not.
		System.out.println(integers.search(4));//it will search in the stack for element if it is their return that element
		System.out.println(integers.search(7));//if is not their return -1*****
	}

}
