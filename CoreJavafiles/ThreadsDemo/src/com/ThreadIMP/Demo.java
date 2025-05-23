package com.ThreadIMP;

public class Demo {

	public static void main(String[] args) {
		Prinable obj = new Prinable();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					obj.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					obj.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}

class Prinable {
	private int number; // scope = with in a class

	synchronized void printOdd() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			number = i;
			if (!(number % 2 == 0)) {
				System.out.println("Shami=" + number);
			} else {
				System.out.println(" Shami is waiting =" + i);
				wait(); // waiting and release the lock
			}
			notify();
		}
	}

	synchronized void printEven() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			number = i;
			if (number % 2 == 0) {
				System.out.println("Bumrah=" + number);
			} else {
				System.out.println(" Bumrah is waiting =" + i);
				wait();
			}
			notify();
		}
	}
}
