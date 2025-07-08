package com.TaskOnnestedInner;

public class Cat0 {
	public static void main(String[] args) {
		Animal0 animal01 = new Animal0() {

			@Override
			void makesound() {
				System.out.println("meow");

			}
		};
		animal01.eat();
		animal01.makesound();
	}

}
