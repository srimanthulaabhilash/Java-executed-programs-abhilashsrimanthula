package com.thread.demo;

public class AnonymousEx {

	public static void main(String[] args) {
		Spotify spotify = new Spotify();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					spotify.Songs();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.setName("Thread-Spotify songs : ");
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					spotify.Advertise();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t2.setName("Thread-Spotify Advertise : ");
		t2.start();
	}
}
