package com.TaskOnInterface;

public interface SmartDevice {
	default void connect() {
		System.out.println("Device is connection");
		
	}
	static void status() {
		System.out.println("Devices current ststus");
	}

}
