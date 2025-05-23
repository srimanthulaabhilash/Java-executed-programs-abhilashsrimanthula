//6.Define an interface Movable with a method move(). Then, create two classes Car and Person that implement this interface.

package com.TaskOnnestedInner;

public interface MovableMain {
	void methoMove();

}

class Car implements MovableMain {

	@Override
	public void methoMove() {
		System.out.println("car moves");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.methoMove();
	}

}

class Person implements MovableMain{

	@Override
	public void methoMove() {
		System.out.println("person moves");
	}
	public static void main(String[] args) {
		Person person=new Person();
		person.methoMove();
	}

}

