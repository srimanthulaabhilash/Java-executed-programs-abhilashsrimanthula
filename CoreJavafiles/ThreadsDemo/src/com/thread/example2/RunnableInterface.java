package com.thread.example2;
/*We can define a Thread even by implementing Runnable interface also.
Runnable interface present in java.lang.pkg and contains only one method run().*/

public class RunnableInterface implements Runnable {
	/*
	 * Among the 2 ways of defining a Thread, implements Runnable approach is always
	 * recommended.
	 * 
	 *   In the 1st approach our class should always extends Thread
	 * class there is no chance of extending any other class hence we are missing
	 * the benefits of inheritance.
	 * 
	 *   But in the 2nd approach while implementing
	 * Runnable interface we can extend some other class also. Hence implements
	 * Runnable mechanism is recommended to define a Thread.
	 */

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " executed  " + i);

		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableInterface());// creating a new thread by implementing Runnable
		t1.setName("payment Thread");
		t1.start();
		Thread t2 = new Thread(new RunnableInterface());
		t2.setName("Order Thread");
		t2.start();

	}

}
