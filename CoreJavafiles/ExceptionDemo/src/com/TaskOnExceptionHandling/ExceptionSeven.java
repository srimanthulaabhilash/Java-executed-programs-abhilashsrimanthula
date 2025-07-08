//7.You want to parse a string to an integer, take the input from user ,but the string may
//contain non-numeric characters. Handle the exception and inform the user of the invalid input.
package com.TaskOnExceptionHandling;

import java.util.Scanner;

public class ExceptionSeven {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		try {
			int s = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Exception caught and your are given invalid input : ");
//		    e.printStackTrace();
		}

	}

}
