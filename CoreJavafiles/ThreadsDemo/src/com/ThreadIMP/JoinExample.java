package com.ThreadIMP;

public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println(LocalTime.now());// main thread execution start here
		Thread t1 = new Thread(() -> {
			Print.disp("T1 = ");

		}); // executed by main thread
		t1.start(); // executed by main thread
		Thread t0 = new Thread(() -> {

			Print.disp("T0 = ");

		}); // executed by main thread
		t0.start();

		Thread t2 = new Thread(() -> {

			Print.disp("T2 = ");
		});
		t2.start();

		Thread t3 = new Thread(() -> {
			try {
				t2.join(); // T2 joins T3, it will tell T3 to wait until T2 completes
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Print.disp("T3 = ");
			Thread t4 = new Thread(() -> {
				try {
					t0.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Print.disp("T4 = ");

			});
			t4.start();

			Thread t5 = new Thread(() -> {
				try {
					t0.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Print.disp("T5 = ");

			});
			t5.start();

		});
		t3.start();

		System.out.println("Main Thread before joining ...");
		t1.join(); // This is main Thread, T1 joins main thread,
		// it will tell main thread to wait until T1 complete
		System.out.println("Main End ...");
//		System.out.println(LocalTime.now());
	}

}

class Print {
	static void disp(String name) {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(name + i);
		}
	}

}
