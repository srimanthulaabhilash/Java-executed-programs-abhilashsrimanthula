package com.thread.example2;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();// Here we have only one thread main
//		t1.run(); //when we are going to call run method it excutes the run method as main Thread
		t1.setName("My own thread ");
		t1.start();
		/*
		 * Here we have main thread and t1 thread , when you are calling start method a
		 * new thread is going to be invoke.
		 */
		System.out.println("main method ");

	}

}
