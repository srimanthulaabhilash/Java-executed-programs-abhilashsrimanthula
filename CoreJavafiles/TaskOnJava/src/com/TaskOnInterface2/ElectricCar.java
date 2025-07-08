package com.TaskOnInterface2;

public class ElectricCar implements Vehical, Electrivvehical {
	@Override
	public void charge() {
		System.out.println("Electric car will charge");
	}

	@Override
	public void start() {
		System.out.println("Electrical car will start");
	}

	public static void main(String[] args) {
		ElectricCar car = new ElectricCar();
		car.charge();
		car.start();

	}

}
