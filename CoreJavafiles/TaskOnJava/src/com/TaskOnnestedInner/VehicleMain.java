//5.Create an abstract class Vehicle with a method speed() that should be implemented by subclasses Car and Bike.

package com.TaskOnnestedInner;

abstract class Vehicle {
	abstract void methodSpeed();

	class Car extends Vehicle {

		@Override
		void methodSpeed() {
			System.out.println("Car speed ");

		}

	}

	class Bike extends Vehicle {

		@Override
		void methodSpeed() {
			System.out.println("Bike speed");
		}

	}
}

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle() {
			
			@Override
			void methodSpeed() {
				// TODO Auto-generated method stub
				
			}
		};
		Vehicle.Car car=vehicle.new Car();
		car.methodSpeed();
		
		Vehicle.Bike bike=vehicle.new Bike(); 
		bike.methodSpeed();
		}

}
