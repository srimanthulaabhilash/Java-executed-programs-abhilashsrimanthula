package com.StaticandInstanceControlFlow;

class Counter {
	int count = 0; // Instance variable (shared across threads)

	public void increment() {
		count++;
	}
}

class YourThread extends Thread {
	Counter c;

	YourThread(Counter c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			c.increment();
		}
	}
}
/*
 * Instance Variables Are Not Thread-Safe : Instance variables belong to the
 * object, and multiple threads sharing the same object can access and modify
 * them simultaneously. If multiple threads modify an instance variable at the
 * same time, data inconsistency can occur.
 */

public class InstanceVariableThreadSafety {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter(); // Shared object

		YourThread t1 = new YourThread(counter);
		YourThread t2 = new YourThread(counter);
//		System.gc();

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Counter Value: " + counter.count);
	}
}
