package com.Task;

public class TransactionT {
	public void doTrancation() {
		System.out.println("1 . validate Bank ");

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2 . get otp from  Bank ");
		synchronized (this) {
			System.out.println("3 . validate card  ");
			System.out.println("4 . Do transaction ");
			System.out.println("5.Adithya snake");
		}
		System.out.println("6.Adithya big snake");
	}

}
