package com.ObjectClass;

//Shallow cloning

class Cat {
	int j;

	Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {

	Cat C;
	int i;

	Dog(Cat C, int i) {
		this.C = C;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}
}

public class ShallowCloning {

	public static void main(String[] args) {
		Cat cat = new Cat(20);
		Dog d1 = new Dog(cat, 10);
		System.out.println(d1.i+"==="+d1.C);

		try {
			Dog dog2 = (Dog) d1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
