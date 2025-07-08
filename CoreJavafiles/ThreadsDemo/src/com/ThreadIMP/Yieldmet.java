package com.ThreadIMP;

class T4 extends Thread {
	public void run() {/* 3.running state */
//		try {
//			Thread.sleep(10);/* sleep state by join() , sleep() and yeild() */
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 0; i < 5; i++) {
			/*
			 * yield() method causes "to pause current executing Thread for giving the
			 * chance of remaining waiting Threads of same priority".
			 */
			System.out.println(Thread.currentThread().getName());
		}
	}
	/* 4. dead state */
}

public class Yieldmet {
	/*
	 * 2. If all waiting Threads have the low priority or if there is no waiting
	 * Threads then the same Thread will be continued its execution. 3. If several
	 * waiting Threads with same priority available then we can't expect exact which
	 * Thread will get chance for execution. 4. The Thread which is yielded when it
	 * get chance once again for execution is depends on mercy of the Thread
	 * scheduler. 5. public static native void yield();
	 */

	public static void main(String[] args) throws InterruptedException {
		T4 t4 = new T4(); /* 1. new state or born state */
		t4.setName("product Thread");
		t4.yield();
		t4.start();/* 2. ready or runnable state */

		Thread T5 = new Thread(new T4());
		T5.setName("Service Thread ");
		T5.setPriority(10);
		T5.start();

//		for (int i = 0; i < 5; i++) {
//			Thread.yield();
//
//			System.out.println("main thread ");
//
//		}

	}
	/*
	 * In the above program child Thread always calling yield() method and hence
	 * main Thread will get the chance more number of times for execution. Hence the
	 * chance of completing the main Thread first is high
	 */

}
