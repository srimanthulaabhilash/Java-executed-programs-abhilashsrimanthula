package com.ThreadIMP;

class Ramesh extends Thread {/* ramesh thread */

	public void run() {
		System.out.println(" ramesh : waiting for suresh  ");

	}
}

class Suresh extends Thread {/* suresh thread */
	public void run() {
		System.out.println(" suresh : waiting for main thread   ");

	}

}

public class JoinMet {
	/*
	 * If a Thread wants to wait until completing some other Thread then we should
	 * go for join() method. Example: If a Thread t1 executes t2.join() then t1
	 * should go for waiting state until completing t2.
	 */

	public static void main(String[] args) throws InterruptedException {

		Ramesh ramesh = new Ramesh();
		ramesh.start();
		ramesh.join();

		Suresh suresh = new Suresh();
		suresh.start();
		suresh.join();

		System.out.println(" Yeah bro  i am comming On the way ..  ");/* main thread */

	}

}
