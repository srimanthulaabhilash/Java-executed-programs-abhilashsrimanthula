package com.ThreadIMP;

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("run method " + i);
		}

	}

}

public class MainAndMyThread extends Thread {

	public static void main(String[] args) {
		MainAndMyThread andMyThread = new MainAndMyThread();

		Mythread mythread = new Mythread();
		Thread thread = new Thread(mythread);
		thread.setName("My own thread ");// in order to set the name of a thread
		System.out.println(thread.getName());// in order to get the name of a thread
		thread.start();

		for (int i = 0; i <= 3; i++) {
			System.out.println("main method " + i);
		}

		System.out.println(thread.currentThread().getName());
	}

}
