package com.constructor;
/*Abstract class constructor will be executed for every child class object creation to
perform initialization of child class object only.

We can't create object for abstract class but abstract class can contain constructor what
is the need ?

Whenever we are creating child class object then parent class constructor will be
executed.(true)
*/

abstract class Animal {
	String name;

	Animal(String name) {
		super();
		this.name = name;
		System.out.println("name of the animal is :" + name);

	}

}

class Dog extends Animal {
	String breed;

	Dog(String name, String breed) {
		super(name);
		this.breed = breed;
		System.out.println("dog constructor " + breed);
	}

}

public class AbstractConstructor {

	public static void main(String[] args) {
		Dog dog=new Dog("lucky", "GermanShaperd");
	}

}
