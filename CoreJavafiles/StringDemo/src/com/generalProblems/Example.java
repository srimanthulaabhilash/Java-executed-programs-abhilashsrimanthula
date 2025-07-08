package com.generalProblems;

import java.util.Scanner;

public class Example {
	static void fibonicc(int N) {
		int firstV = 0;
		int secV = 1;
		
		for (int i = 0; i < N; i++) {
			int nextValue = firstV +secV;
			firstV = secV;
			secV = nextValue;
			
			System.out.println(nextValue);

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number for fib : ");
		int N = scanner.nextInt();
		fibonicc(N);

	}

}
