package com.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadEx {
	public static void main(String[] args) {
		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();

		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<String> future = executor.submit(one);
		executor.submit(two);

	}

}

class ThreadOne implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName() + " callable: Step " + i);
		}
		System.out.println("cpmplted");
		return "cpmpleted ";
	}

}

class ThreadTwo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " runnable step " + i);

		}
	}

}