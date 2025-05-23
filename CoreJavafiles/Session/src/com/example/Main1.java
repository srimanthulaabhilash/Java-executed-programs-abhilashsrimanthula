package com.example;

public class Main1 {
	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println(" in method show");

			}

			public void print() {
				System.out.println(" in method print");

			}
		};
		obj.show();
		obj.print();
	}
}
