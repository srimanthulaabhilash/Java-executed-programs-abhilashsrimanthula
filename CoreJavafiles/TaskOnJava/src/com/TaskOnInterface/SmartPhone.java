package com.TaskOnInterface;

public class SmartPhone implements SmartDevice{
	@Override
	public void connect() {
		System.out.println("Device is connected");
		
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.connect();
	}
	

}
