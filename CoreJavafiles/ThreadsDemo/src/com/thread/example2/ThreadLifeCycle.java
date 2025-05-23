package com.thread.example2;

class T1 extends Thread {
	public void run() {
		System.out.println("thread t1");
	}

}

public class ThreadLifeCycle {
	/*
	 * Once we created a Thread object then the Thread is said to be in new state or
	 * born state.  Once we call start() method then the Thread will be entered
	 * into Ready or Runnable state.  If Thread Scheduler allocates CPU then the
	 * Thread will be entered into running state.  Once run() method completes then
	 * the Thread will entered into dead state.
	 */

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
//		t1.start();
		/*
		 * After starting a Thread we are not allowed to restart the same Thread once
		 * again otherwise we will get runtime exception saying
		 * "IllegalThreadStateException".
		 */

	}

}
