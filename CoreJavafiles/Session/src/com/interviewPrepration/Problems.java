package com.interviewPrepration;

public class Problems {

	public static void main(String[] args) {
		int arr[] = {9, 9, 2,9, 2};
		for (int i = 0; i < arr.length ; i++) {
			boolean paired = false;
			for (int j = 0; j < arr.length ; j++) {
				if (i != j && arr[i] == arr[j]) {
					paired = true;
					break;
				}

			}
			if (!paired) {
				System.out.println(arr[i]);
			}

		}

	}

}
