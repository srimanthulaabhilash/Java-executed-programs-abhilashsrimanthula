package com.TaskOnInterface2;

public class Duck implements Flyable, Swimming {

	@Override
	public void swim() {
		System.out.println("Duck can swim..");
	}

	@Override
	public void fly() {
		System.out.println("but Duck cannot fly..");

	}
	public static void main(String[] args) {
		 Duck duck =new Duck();
		 duck.swim();
		 duck.fly();
		
	}
	

}
