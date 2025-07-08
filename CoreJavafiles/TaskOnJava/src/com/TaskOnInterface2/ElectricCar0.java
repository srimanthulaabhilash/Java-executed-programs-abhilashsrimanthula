package com.TaskOnInterface2;

public class ElectricCar0 extends Vehicle0 implements Electric0 {

	@Override
	void startEngine() {
		System.out.println("start the Electric engine");
	}

	@Override
	public void chargeBattery() {
		System.out.println("charge the Electeric battery");
	}
	public static void main(String[] args) {
		ElectricCar0 Ecar0= new ElectricCar0();
		Ecar0.chargeBattery();
		Ecar0.startEngine();
	}
}
