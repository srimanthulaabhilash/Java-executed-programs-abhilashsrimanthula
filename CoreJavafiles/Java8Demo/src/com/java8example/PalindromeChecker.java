package com.java8example;

import java.util.stream.*;

public class PalindromeChecker {

	public static boolean isPalindrome(int number) {

		String numStr = String.valueOf(number);
		String reversed = numStr.chars().mapToObj(c -> (char) c).collect(Collectors.toList()).stream()
				
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.reverse().toString();
		return numStr.equals(reversed);
	}

	public static void main(String[] args) {
		int number = 353;
		if (isPalindrome(number)) {
			System.out.println("palindrome.");
		} else {
			System.out.println("not a palindrome.");
		}
	}
}
