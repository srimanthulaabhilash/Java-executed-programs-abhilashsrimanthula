package com.interviewPrepration;

public class Problem2 {

	public static void main(String[] args) {
		int startpoint = 10;
		int endpoint = 85;
		int steps = 30;
		int count = 0;
		while (startpoint <= endpoint) {
			startpoint = startpoint + steps;
			count++;

		}
		System.out.println(count);

	}

}
