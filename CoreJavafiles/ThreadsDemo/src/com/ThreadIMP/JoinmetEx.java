package com.ThreadIMP;

public class JoinmetEx {

	public static void main(String[] args) throws InterruptedException {
		ThreadEx ex = new ThreadEx();
		ex.start();
//		ex.join();

		synchronized (ex) {
			ex.wait();
			System.out.println("sum is : " + ex.sum);
		}
	}
}

class ThreadEx extends Thread {
	int sum;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				sum += i;

			}
			this.notify();

		}

	}

}
