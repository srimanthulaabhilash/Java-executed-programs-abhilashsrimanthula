package com.TaskOnnestedInner;

//2.Create an abstract class Animal with an abstract method sound(). In the Main class,
//create an anonymous inner class that extends Animal and provides an implementation for the sound()
//method. Print the sound of the animal.
abstract class Animal {

	abstract void sound();

}

public class Animals {

	public static void main(String[] args) {
		Animal animal = new Animal() {

			@Override
			public void sound() {
				System.out.println("animal sounds");
			}

		};
		animal.sound();

	}

}
