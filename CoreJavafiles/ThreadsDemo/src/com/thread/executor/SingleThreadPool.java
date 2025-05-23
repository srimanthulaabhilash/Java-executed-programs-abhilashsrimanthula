package com.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		for (int i = 0; i < 10; i++) {
			int N = i;
			executorService.submit(() -> {
				System.out.println("Executing Task " + N + " by " + Thread.currentThread().getName());
			});
		}
		System.out.println("=========================");
		/*
		 * Thread ThOne = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(ThOne);
		 * 
		 * 
		 * Thread Thtwo = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thtwo);
		 * 
		 * Thread Ththree = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Ththree);
		 * 
		 * Thread Thfour = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thfour);
		 * 
		 * Thread Thfive = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thfive);
		 * 
		 * Thread Thsix = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thsix);
		 * 
		 * Thread Thseven = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thseven);
		 * 
		 * Thread Theight = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Theight);
		 * 
		 * Thread Thnine = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thnine);
		 * 
		 * Thread Thten = new Thread(() -> { for (int i = 0; i < 4; i++) {
		 * System.out.println(Thread.currentThread().getName()); } });
		 * executorService.submit(Thten);
		 */

	}

}
