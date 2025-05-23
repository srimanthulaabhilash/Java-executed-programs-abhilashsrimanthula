package com.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureEx {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Task task = new Task();/* 1 task is created */

		Future<Integer> future = executorService.submit(task);/* Time to complete the task : 2.5hrs */
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main Thread : I am doing another task ");/* 1hr */

		System.out.println("main thread checking the status of Task :" + future);/* Not completed */

		try {
			System.out.println("main thread Checking..is task completed in future : "
					+ future.get());/*
									 * future.get is the blockimg operation it will not execute
									 */
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}
}

class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("Thread started , Name is :  " + Thread.currentThread().getName());
		int count = 0;
		for (int i = 0; i < 5; i++) {
			Thread.sleep(50000);
			count = count + 1;
		}
		return count;
	}

}
