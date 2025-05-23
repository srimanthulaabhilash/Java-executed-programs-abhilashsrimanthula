package com.CheckedException;

public class CheckedExceptionExample2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.CheckedException.CheckedExceptionE");
		} catch (ClassNotFoundException e) {
			System.out.println("exception caught :"+e);
		}
		System.out.println("hello everyone");
	}

}
