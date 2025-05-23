package com.durgajava8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionEx {
	public void methodA() {
		System.out.println("hello");
	}
	
//	(int n) -> System.out.println();
	

	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i * i;
		System.out.println("Square : " + function.apply(4));

		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(5));

//	==>	The main objective of lambda expression to bring thr functional programming in java
//	==>It is an Annomyous function(without name and without return type , modifiers)

	}

}
