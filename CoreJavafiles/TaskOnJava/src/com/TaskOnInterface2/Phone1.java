package com.TaskOnInterface2;

public class Phone1 implements Device1 {

	public void turnOn() {
		System.out.println("phone is running..");
	}

	public static void main(String[] args) {
		Phone1 phone1 = new Phone1();
		phone1.turnOn();

	}

}
