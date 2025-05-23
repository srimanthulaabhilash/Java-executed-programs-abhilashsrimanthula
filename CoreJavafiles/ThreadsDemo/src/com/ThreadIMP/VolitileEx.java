package com.ThreadIMP;

import java.util.concurrent.atomic.AtomicInteger;

public class VolitileEx {
	public static void main(String[] args) {
		volatileclass v = new volatileclass();
		for (int i = 0; i < 10; i++) {
			final int thread = i;
			new Thread(() -> {
				System.out.println("Thread" + thread + " = " + v.getNextUniqueIndex());
			}).start();
		}
	}
}

class volatileclass {
	private AtomicInteger atomicCounter = new AtomicInteger();
	public volatile int a;

	int getNextUniqueIndex() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a++;
	}
}
