package com.thread.example2;

public class ThreadEx extends Thread {
	/*
	 * If we override start() method then our start() method will be executed just
	 * like a normal method call and no new Thread will be started Entire output
	 * produced by only main Thread. Note : It is never recommended to override
	 * start() method
	 */
	@Override
	public void start() {
		super.start();// in this case the thread class start will call and invoke the run method
		System.out.println("start method ");
	}

	public void run() throws ArithmeticException {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("exception caught ");
		}
	}

	public static void main(String[] args) {

	}

}
