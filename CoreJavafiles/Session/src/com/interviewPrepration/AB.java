package com.interviewPrepration;

public class AB {
	public static void Solution(int A, int B, int K) {
		for (int i = A; i <= B; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	

	public static void main(String[] args) {
		Solution(2, 11, 2);
	}

}
