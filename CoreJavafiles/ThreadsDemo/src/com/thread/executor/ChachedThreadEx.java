package com.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChachedThreadEx {
	public static void main(String[] args) {
		ExecutorService e = Executors.newCachedThreadPool();
		for (int i = 0; i <= 10; i++) {
			e.submit(new PrintHello());
		}
	}
}

class PrintHello implements Callable {
	@Override
	public Object call() throws Exception {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello " + i + " " + Thread.currentThread().getName());
		}
		return null;
	}
}
