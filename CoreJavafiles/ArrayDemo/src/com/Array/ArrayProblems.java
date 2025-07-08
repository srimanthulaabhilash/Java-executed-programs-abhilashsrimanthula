package com.Array;

import java.util.Scanner;

public class ArrayProblems {
	static void closestNum(int N, int[] arr) {
		int closeNum = arr[0];
		int difference = Math.abs(arr[0] - 1);
		for (int i = 0; i < arr.length; i++) {
			int diff = Math.abs(arr[i] - N);
			if (diff < difference) {
				closeNum = arr[i];
				difference = diff;

			}
		}
		System.out.println(closeNum);
	}

	static void pairsofSum(int target, int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println(num[i] + " , " + num[j]);

				}
			}

		}

	}

	static void duplicates(int[] num) {
		int x = num[0];
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("the duplicates number are :" + num[i]);

				}

			}

		}

	}

	static void OccarenceOfChar(char[] c, char T) {
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == T) {
				count++;
			}

		}
		System.out.println("count of a character :" + count);
	}

	static void maximumNum(int[] numbers) {
		int large = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > large) {
				large = numbers[i];
			}
		}
		System.out.println(large);
	}

	static void minmumNum(int[] numbers) {
		int Min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < Min) {
				Min = numbers[i];
			}
		}
		System.out.println(Min);
	}

	static void MissingNum(int array[]) {
		int n = 7;
		int expSum = n * (n + 1) / 2;
		int sumOfArr = 0;
		for (int i = 1; i < array.length; i++) {
			sumOfArr = sumOfArr + array[i];
		}
		int missNum = expSum - sumOfArr;
		System.out.println(missNum);

	}

	static void volesCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
				count++;
				System.out.println("vowels are :" + ch);
			}

		}
		System.out.println("count of vowela is : " + count);

	}

	static void SumOf(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		System.out.println(sum);
	}

	static void CommonNumbers(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

				}

			}

		}

	}

	static void ReverseAnArray(int[] arr) {
		for (int i = arr.length-1 ; i > 0; i--) {
			System.out.println(arr[i]);

		}

	}
	static void SwapNumbers(int[]arr) {
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Enter a num : ");
//		int n = scanner.nextInt();
		int numbers[] = { 2, 4, 6, 8, 9, 12, 10, 4, 7 };
//		closestNum(n, numbers);

//		System.out.println("enter target num :");
//		int target = scanner.nextInt();
//		pairsofSum(target, numbers);

//		duplicates(numbers);

//		System.out.println("enter a char : ");
//		char[] charArray = { 'a', 'b', 'h', 'i', 'l', 'a', 's', 'a' };
//		char chr = 'a';
//		OccarenceOfChar(charArray, chr);

//		maximumNum(numbers);

//		minmumNum(numbers);

//		System.out.println("missing number is :");
//		int array[] = { 0, 1, 2, 3, 5, 6 ,7};
//		MissingNum(array);

//		System.out.println("enter your name  to count vowels : ");
//		String str = scanner.next();
//		volesCount(str);

//		System.out.println("sum of array is : ");
//		SumOf(numbers);

//		System.out.println("reverse of an array : ");
		int arr[] = { 1, 2, 3, 4, 5 };
		ReverseAnArray(arr);

	}

}
