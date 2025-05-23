package com.interviewPrepration;

public class Solution {
	static int solution(int[] A) {
		int N = A.length;
		int minIndex = 0;
		double minAvg = Double.MAX_VALUE;
		for (int i = 0; i < N - 1; i++) {
			// Check slice of size 2
			double avg2 = (A[i] + A[i + 1]) / 2.0;
			if (avg2 < minAvg) {
				minAvg = avg2;
				minIndex = i;
			}

			// Check slice of size 3 (if possible)
			if (i < N - 2) {
				double avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
				if (avg3 < minAvg) {
					minAvg = avg3;
					minIndex = i;
				}
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {

	}
}
