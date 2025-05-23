package com.Task;

public class FlipcartSync {

	public static void main(String[] args) {
		Product product = new Product();
		ThreadOne one = new ThreadOne(product);
		ThreadTwo two = new ThreadTwo(product);
		one.start();
		two.start();

	}

}

class Product {
	 void fashon() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(200);
			System.out.println("Jeans");
		}

	}

	 void beauty() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(200);
			System.out.println("make Up");

		}
	}
}

class ThreadOne extends Thread {
	private Product pt;

	ThreadOne(Product pt) {
		this.pt = pt;
	}

	@Override
	public void run() {
		try {
			pt.fashon();
		} catch (InterruptedException e) {
			System.out.println("Exception caught " + e);
		}

	}

}

class ThreadTwo extends Thread {
	private Product pt;

	ThreadTwo(Product pt) {
		this.pt = pt;
	}

	@Override
	public void run() {
		try {
			pt.beauty();
		} catch (InterruptedException e) {
			System.out.println("Exception caught " + e);
		}

	}

}
