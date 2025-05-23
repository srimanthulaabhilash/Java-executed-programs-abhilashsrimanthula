package com.TaskOnnestedInner;

public class Dog0 {
	public static void main(String[] args) {
		Animal0 animal0 = new Animal0() {

			@Override
			void makesound() {
				System.out.println("Wooff");
			}
		};
		animal0.eat();
		animal0.makesound();
	}

}
