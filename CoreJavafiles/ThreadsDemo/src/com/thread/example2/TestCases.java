package com.thread.example2;

public class TestCases implements Runnable {

	@Override
	public void run() {
		System.out.println("test class run method ");
	}

	public static void main(String[] args) {
		Thread T1 = new Thread();
		T1.start();/*
					 * A new Thread will be created which is responsible for the execution of Thread
					 * class run()method.
					 */
		T1.run();/*
					 * No new Thread will be created but Thread class run() method will be executed
					 * just like a normal method call.
					 */

		Thread T2 = new Thread(new TestCases());
		T2.start();/*
					 * New Thread will be created which is responsible for the execution of
					 * TestCases run() method.
					 */
		T2.run();/*
					 * No new Thread will be created and Testcases run() method will be executed
					 * just like a normal method call.
					 */
		TestCases cases = new TestCases();
		/*
		 * cases.start(); We will get compile time error saying start()method is not
		 				* available in MyRunnable class.
		 				*/
		cases.run();/*
					 * No new Thread will be created and MyRunnable class run() method will be
					 * executed //just like a normal method call.
					 */

	}

}
