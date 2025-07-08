package com.thread.demo;

import java.util.concurrent.Callable;

public class TypesToCreateThread {
	public static void main(String[] args) {
		Runnable runnable = () -> {

		};
		runnable.run();

		Thread1 thread1 = new Thread1();
		thread1.start();// approch 1

		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2);
		thread.start();// approch 2

		Thread thread3 = new Thread(() -> {
			System.out.println("using lambda");
		});
		thread3.start();// approch 3

	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("extending thread");

	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("implementing runnable");

	}

}

class Thread4 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("implementing callable");
		return null;
	}

}
