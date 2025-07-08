package com.thread.example;

public class ThreadT2 extends Play implements Runnable {

	@Override
	/*
	 * If we are not overriding run() method then Thread class run() method will be
	 * executed which has empty implementation and hence we won't get any output.
	 * 
	 * It is highly recommended to override run() method. Otherwise don't go for
	 * multithreading concept.
	 */
	public void run() {
		play();
		System.out.println("threadT2 ");

	}
	/*
	 * We can overload run() method but Thread class start() method always invokes
	 * no argument run() method the other overload run() methods we have to call
	 * explicitly then only it will be executed just like normal method.
	 */

	public static void main(String[] args) {
		ThreadT2 t2 = new ThreadT2();

	}

}
