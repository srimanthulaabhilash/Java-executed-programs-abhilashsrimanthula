package com.Task;

public class ThreadT extends Thread {
	private TransactionT T;

	ThreadT(TransactionT T) {
		this.T = T;

	}

	public void run() {
		T.doTrancation();

	}

	public static void main(String[] args) {
		TransactionT t = new TransactionT();
		ThreadT T1 = new ThreadT(t);
		ThreadT T2 = new ThreadT(t);
		T1.start();
		T2.start();

	}

}
