package com.TaskOnInterface2;

public interface Device1 {
	static void turnOn() {
		System.out.println("Device is running..");
	}

	public static void main(String[] args) {
		Device1.turnOn();
	}

}
