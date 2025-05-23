package com.thread.demo;

public class Spotify {

	public synchronized void Songs() throws InterruptedException {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Play songs ");
			notify();
			wait();
		}
	}

	public synchronized void Advertise() throws InterruptedException {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Advertise ");
			notify();
			wait();
		}
	}
}
