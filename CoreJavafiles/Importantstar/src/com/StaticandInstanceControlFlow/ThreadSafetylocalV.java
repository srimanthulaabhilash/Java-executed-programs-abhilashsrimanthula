package com.StaticandInstanceControlFlow;

/* Local Variables are Thread-Safe
Each thread gets its own copy of local variables when executing a method.
Local variables are stored in the stack memory, which is thread-specific.
Since no other thread can access another thread’s stack, local variables are inherently thread-safe. */
class MyThread extends Thread {
	public void run() {
		int localVar = 10; // Each thread gets its own copy
		System.out.println(Thread.currentThread().getName() + " - LocalVar: " + localVar);
	}
}

public class ThreadSafetylocalV {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.start();
		t2.start();
	}
}
