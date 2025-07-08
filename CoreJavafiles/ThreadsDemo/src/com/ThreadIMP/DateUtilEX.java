package com.ThreadIMP;

import java.util.Date;

public class DateUtilEX {
	// Loaded 1
	public static void main(String[] args) { // jvm start
		Thread person1 = new Thread(new Runnable() {
			public void run() {
				try {
					DateUtil.printToday();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		person1.start();
		Thread person2 = new Thread(new Runnable() {
			public void run() {
				try {
					DateUtil.printOldDate();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		person2.start();
	} // end execution
}

class DateUtil { // Class c1 = new Class(DateUtil);
	synchronized public static void printToday() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("T1=" + new Date());
		}
	}

	synchronized public static void printOldDate() throws InterruptedException {
		Date d = new Date(2024, 5, 12);
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("T2=" + d);
		}
	}
}
