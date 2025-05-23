package com.ThreadIMP;

class Primary {
	public void method() {
		System.out.println("Primary object ");

	}

}

public class CommonObject {

	public static void main(String[] args) {
		Primary primary = new Primary();

		Subject1 subject1 = new Subject1(primary);
		subject1.method();
		Subject2 subject2 = new Subject2(primary);
		subject2.method();
		primary.method();
		System.out.println(primary);

	}

}

class Subject1 {
	private Primary p;

	public Subject1(Primary p) {
		this.p = p;

	}

	void method() {
		System.out.println("class subject 1 " + p);
	}
}

class Subject2 {
	private Primary p;

	public Subject2(Primary p) {
		this.p = p;

	}

	void method() {
		System.out.println("class subject 2 " + p);
	}

}
