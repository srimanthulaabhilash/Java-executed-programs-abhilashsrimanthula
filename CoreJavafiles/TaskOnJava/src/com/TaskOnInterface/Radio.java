package com.TaskOnInterface;

public class Radio  implements Device {

	@Override
	public void turnOn() {
		System.out.println(" Radio is turning on");		
	}
	public static void main(String[] args) {
		 Radio radio =new Radio();
		 radio.turnOn();
		 
	}

}
