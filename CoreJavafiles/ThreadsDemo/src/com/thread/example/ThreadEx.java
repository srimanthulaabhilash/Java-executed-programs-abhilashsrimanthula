package com.thread.example;
/*Multitasking: Executing several tasks simultaneously

* Process based multitasking:
Executing several tasks simultaneously where each task is a separate independent
process such type of multitasking is called process based multitasking.*/

/*Thread based multitasking:
Executing several tasks simultaneously where each task is a separate independent part
of the same program, is called Thread based multitasking.
And each independent part is called a "Thread".

 */

public class ThreadEx extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Srimanthula" + i);

		}
	}

	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		ex.start();
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println("name is " + t1.getName());
		t1.setPriority(MIN_PRIORITY);
		System.out.println(" main Priority is " + t1.getPriority());

		Thread thread2 = new Thread(new ThreadEx());
		thread2.start();
//		thread2.setPriority(MAX_PRIORITY);

		System.out.println("my thread p is : " + thread2.getPriority());

	}

}
