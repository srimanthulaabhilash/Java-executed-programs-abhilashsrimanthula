package com.thread.example;
/* Thread Scheduler:
 * 
 * If multiple Threads are waiting to execute then which Thread will execute 1st is
decided by "Thread Scheduler" which is part of JVM.

 Which algorithm or behavior followed by Thread Scheduler we can't expect
exactly it is the JVM vendor dependent hence in multithreading examples we
can't expect exact execution order and exact output.*/

public class ThreadEx2 {

	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		ex.start();
		/*
		 * In the case of t.start() a new Thread will be created which is responsible
		 * for the execution of run() method.
		 */

//		ex.run();
		/*
		 * But in the case of t.run() no new Thread will be created and run() method
		 * will be executed just like a normal method by the main Thread.
		 * 
		 *   In the above
		 * program if we are replacing t.start() with t.run() the following is the
		 * output.
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("abhilash main" + i);

		}

	}

}
