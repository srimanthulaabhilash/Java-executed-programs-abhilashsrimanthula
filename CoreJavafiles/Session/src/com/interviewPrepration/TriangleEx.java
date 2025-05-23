package com.interviewPrepration;

import java.util.Arrays;

public class TriangleEx {
	public static int solution(int[] A) {
		int N = A.length;
		if (N < 3)
			return 0;

		Arrays.sort(A);

		for (int i = 0; i < N - 2; i++) {
			if ((long) A[i] + (long) A[i + 1] > A[i + 2]) {
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
//		int[] A = { 0, 0, 0, 1, 2, 1 };
		int[] A = { 1, 4, 2, 0, 6, 5 };

		System.out.println(solution(A));
	}

}
