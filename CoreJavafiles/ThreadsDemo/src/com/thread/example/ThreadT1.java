package com.thread.example;

public class ThreadT1 extends Thread {/*
										 *  In the 1st approach our class should always extends Thread class there is
										 * no chance of extending any other class hence we are missing the benefits of
										 * inheritance.
										 */

	@Override
	public void run() {
		System.out.println("threadT1 : ");
	}

	/*
	 * We can overload run() method but Thread class start() method always invokes
	 * no argument run() method the other overload run() methods we have to call
	 * explicitly then only it will be executed just like normal method.
	 */
	public static void run(int i) {
		System.out.println("run method with parameter ");
	}

	public static void main(String[] args) {

	}

}
