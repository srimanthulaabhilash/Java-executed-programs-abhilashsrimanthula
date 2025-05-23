package com.singleTonClasses;

public class SingletonEx {
	private static SingletonEx one = null;
	private static SingletonEx two = null;

	private SingletonEx() {

	}

	public static SingletonEx getInstance() {
		if (one == null) {
			one = new SingletonEx();
			return one;
		} else if (two == null) {
			two = new SingletonEx();
			return two;
		} else {
			return one;

		}

	}

}
