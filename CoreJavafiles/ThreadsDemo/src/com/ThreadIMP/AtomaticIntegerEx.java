package com.ThreadIMP;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomaticIntegerEx {
	public static void main(String[] args) {
		Amount amount = new Amount();
		for (int i = 0; i < 10; i++) {
			final int thread = i;
			new Thread(() -> {
				System.out.println("Thread" + thread + " = " + amount.getNextUniqueIndex());
			}).start();
		}
	}
}

class Amount {
	private volatile int counter;
	private AtomicInteger atomicCounter = new AtomicInteger(0);

	public int getNextUniqueIndex() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return atomicCounter.getAndIncrement();
	}
}
