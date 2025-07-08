//3.Create an abstract class Animal with an abstract method makeSound() and a non-abstract method eat().
//Then, create two subclasses: Dog and Cat. The Dog class should implement makeSound()
//by printing "Woof", and the Cat class should implement makeSound() by printing "Meow".
//Both classes should inherit the eat() method from Animal.

package com.TaskOnnestedInner;

public abstract class Animal0 {
	abstract void makesound();

	public void eat() {
		System.out.println("Animal can eat anything");

	}

}
