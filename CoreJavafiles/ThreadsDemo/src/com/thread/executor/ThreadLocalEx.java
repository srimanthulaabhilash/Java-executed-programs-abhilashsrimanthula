package com.thread.executor;

public class ThreadLocalEx {
	public static void main(String[] args) {

		ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

		Thread thread = new Thread(() -> {
			threadLocal.set(3);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Integer value = threadLocal.get();
			System.out.println(value);

			threadLocal.remove();
			Integer value2 = threadLocal.get();
			System.out.println(value2);

		});
		Thread thread2 = new Thread(() -> {
			threadLocal.set(4);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Integer value = threadLocal.get();
			System.out.println(value);

		});

		thread.start();
		thread2.start();

	}

}
