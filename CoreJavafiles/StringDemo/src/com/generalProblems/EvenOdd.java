package com.generalProblems;

import java.util.Iterator;
import java.util.Scanner;

public class EvenOdd {
	static void evenOdd(int num) {

		if (num > 0) {
			System.out.println("This number is positive number");

		} else if (num == 0) {
			System.out.println("This number is whole Number");
		} else {
			System.out.println("This number is negative Number");
		}
	}

	public static void range(int lower_value, int higest_value) {
		for (int i = lower_value; i <= higest_value; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	static void swapOf(int v1, int v2) {
		System.out.println("before swaping " + v1 + " " + v2);
		v1 = v1 + v2;
		v2 = v1 - v2;
		v1 = v1 - v2;
		System.out.println("after swaping " + v1 + " " + v2);
	}

	static void Fibonacci(int N) {
		int firstvalue = 0;
		int secValue = 1;
		for (int i = 0; i < N; i++) {
			int nextvalue = firstvalue + secValue;
			firstvalue = secValue;
			secValue = nextvalue;
			System.out.println(nextvalue);

		}

	}

	static void rightAngle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void primeNumber(int N) {
		if (N <= 1) {
			System.out.println("Not a problem ");
		}

	}

	static void Factorial(int N) {
		int factorial = 1;
		for (int i = 1; i <= N; i++) {
			factorial = factorial * i;
			
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter Num :");
//		int num = scanner.nextInt();
//		evenOdd(num);

//		System.out.println("enter first value : ");
//		int Lv = scanner.nextInt();
//		System.out.println("enter last value : ");
//		int Hv = scanner.nextInt();
//		range(Lv, Hv);

//		System.out.println("enter  value1 for swaping  : ");
//		int v1 = scanner.nextInt();
//		System.out.println(" enter value2 for swaping : ");
//		int v2 = scanner.nextInt();
//		swapOf(v1, v2);

//		System.out.println("enter number for Fibonacci Series :");
//		int N=scanner.nextInt();
//		Fibonacci(N);

//		System.out.println("enter num of rows :");
//		int rows=scanner.nextInt();
//		rightAngle(rows);

		System.out.println("enter num for factorial : ");
		int N = scanner.nextInt();
		Factorial(N);

	}

}
