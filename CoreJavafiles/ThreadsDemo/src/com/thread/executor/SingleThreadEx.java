package com.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadEx {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		Thread4 thread4 = new Thread4();
		Thread5 thread5 = new Thread5();

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(thread1);
		executorService.submit(thread2);
		executorService.submit(thread3);
		executorService.submit(thread4);
		executorService.submit(thread5);

	}
}

class Thread1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
		}
		System.out.println("Thread 1 completed ");
		return 9;
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 completed ");
	}
}

class Thread3 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());

		}
		System.out.println("Thread 3 completed ");

		return 100;
	}
}

class Thread4 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());

		}
		System.out.println("Thread 4 completed ");

		return 100;
	}
}

class Thread5 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());

		}
		System.out.println("Thread 5 completed ");

		return 100;
	}
}
