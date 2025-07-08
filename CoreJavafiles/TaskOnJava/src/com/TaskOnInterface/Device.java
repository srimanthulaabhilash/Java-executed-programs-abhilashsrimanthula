package com.TaskOnInterface;

public interface Device {
	 default void turnOn() {
		System.out.println("device is turning on");
	}

}
