package com.TaskOnInterface;

public interface Calculator {
	static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	default void method() {
		
	}
	

}
