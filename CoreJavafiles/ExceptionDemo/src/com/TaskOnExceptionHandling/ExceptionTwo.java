//2.You are using a Scanner to take an integer input from the user, but the user enters a string
//instead. Try this and see what happens.

package com.TaskOnExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		try {
			
			int n = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
//			scanner.close();
			System.out.println("welcome");

		}
		int N =scanner.nextInt();

	}

}