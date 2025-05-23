package com.ThreadIMP;

public class Wish {
	/*
	 * If we are not declaring wish() method as synchronized then both Threads will
	 * be executed simultaneously
	 * 
	 * If we declare wish()method as synchronized then the Threads will be executed
	 * one by one that is until completing the 1st Thread the 2nd Thread will wait
	 * in this case we will get regular output which is nothing but
	 */
	public synchronized void Display(String name) {
		for (int i = 0; i < 6; i++) {
			System.out.println("Happy new year *" + name);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("exception caught  " + e);
			}

		}

	}

	public static void main(String[] args) {

	}

}
