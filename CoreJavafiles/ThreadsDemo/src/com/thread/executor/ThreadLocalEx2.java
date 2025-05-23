package com.thread.executor;

public class ThreadLocalEx2 {
	public static void main(String[] args) {
		Square square = new Square();
		new Thread(() -> {
			square.setSquare(2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(square.doSquare());
		}).start();
		new Thread(() -> {
			square.setSquare(3);
			System.out.println(square.doSquare());
		}).start();
		new Thread(() -> {
			square.setSquare(4);
			System.out.println(square.doSquare());
		}).start();
		new Thread(() -> {
			square.setSquare(5);
			System.out.println(square.doSquare());
		}).start();
	}
}

class Square {
	private int Num;

	public void setSquare(int Num) {
		this.Num = Num;
	}

	public int doSquare() {
		return Num * Num;
	}
}
