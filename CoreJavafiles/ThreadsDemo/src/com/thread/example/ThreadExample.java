package com.thread.example;

public class ThreadExample {

	public static void main(String[] args) {
		ThreadT1 t1 = new ThreadT1();
		t1.start();
		t1.run(6);
		/*
		 * For every Thread the required mandatory activities like registering the
		 * Thread with Thread Scheduler will takes care by Thread class start() method
		 * and programmer is responsible just to define the job of the Thread inside
		 * run() method. That is start() method acts as best assistant to the programmer
		 * 
		 * 
		 * We can conclude that without executing Thread class start() method there is
		 * no chance of starting a new Thread in java. Due to this start() is considered
		 * as heart of multithreading
		 */

		Thread t2 = new Thread(new ThreadT2());
		t2.start();

	}

}
