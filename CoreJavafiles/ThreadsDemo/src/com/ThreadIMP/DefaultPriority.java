package com.ThreadIMP;

class T3 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("my thread " + i);

		}
	}

}

public class DefaultPriority {

	public static void main(String[] args) {
		T3 t3 = new T3();
		t3.setPriority(10);//1
		t3.start();
		/*
		 * If we are commenting line 1 then both main and child Threads will have the
		 * same priority and hence we can't expect exact execution order. 
		 * 
		 *  If we are
		 * not commenting line 1 then child Thread has the priority 10 and main Thread
		 * has the priority 5 hence child Thread will get chance for execution and after
		 * completing child Thread main
		 */

		for (int i = 0; i < 3; i++) {
			System.out.println("main thread " + i);

		}

	}

}
