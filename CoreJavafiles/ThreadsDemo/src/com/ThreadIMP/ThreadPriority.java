package com.ThreadIMP;

class T1 extends Thread {
	public void run() {
		for (int i = 1; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "Thread T1 :" + i);

		}

	}

}

public class ThreadPriority {
	/*
	 * Every Thread in java has some priority it may be default priority generated
	 * by JVM (or) explicitly provided by the programmer.
	 * 
	 * The valid range of Thread priorities is 1 to 10[but not 0 to 10] where 1 is
	 * the least priority and 10 is highest priority.  Thread class defines the
	 * following constants to represent some standard priorities. 1. Thread.
	 * MIN_PRIORITY----------1 2. Thread. MAX_PRIORITY----------10 3. Thread.
	 * NORM_PRIORITY--------5  There are no constants like Thread.LOW_PRIORITY,
	 * Thread.HIGH_PRIORITY  Thread scheduler uses these priorities while
	 * allocating CPU.  The Thread which is having highest priority will get chance
	 * for 1st execution.  If 2 Threads having the same priority then we can't
	 * expect exact execution order it depends on Thread scheduler whose behavior is
	 * vendor dependent.
	 */

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		t1.setPriority(7);
		System.out.println(" T1 Priority : " + t1.getPriority());
		/*
		 * The allowed values are 1 to 10 otherwise we will get runtime exception saying
		 * "IllegalArgumentException".
		 */

		Thread thread = new Thread(new T1());
		thread.start();
		System.out.println("Min p :"+thread.MAX_PRIORITY);
		System.out.println("Max p :"+thread.MIN_PRIORITY);
		System.out.println("default p :"+thread.NORM_PRIORITY);

		System.out.println(" main thread priority is " + Thread.currentThread().getPriority());

	}

}
