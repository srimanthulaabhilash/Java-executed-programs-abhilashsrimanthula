package com.singleTonClasses;
/*For any java class if we are allow to create only one object such type of class is said to be
singleton class.

*1)Runtime class
2) ActionServlet
3) ServiceLocator
4) BusinessDelegate*/

public class Singleton {
	/*
	 * We can create our own singleton classes for this... we have to use private
	 * constructor, static variable and factory method.
	 */
	private static Singleton singleton = null; /* new Singleton();==> egar loading */

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();// Lazy loading
		}
		return singleton;
	}

	public static void main(String[] args) {

		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());

		Runtime runtime = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		Runtime runtime3 = Runtime.getRuntime();

		System.out.println(runtime == runtime2);
		System.out.println(runtime == runtime3);

	}

}
