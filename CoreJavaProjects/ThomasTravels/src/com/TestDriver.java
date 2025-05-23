package com;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {
	public static void main(String[] args) {
		System.out.println("***Welcome to Thomas Travels***");
		Scanner scanner = new Scanner(System.in);
		Driver driver = new Driver(1, "car", "Srimanthula", 123);
		Travel travel = new Travel();

		/*
		 * method 01: This method will check whether the given Driver class object is
		 * belonging to the category “Car”. It will return true if the given Driver
		 * object is of category “Car” else return false.
		 */
		System.out.println("Enter 1 for Car Driver menu!!");
		int choice = scanner.nextInt();
		if (choice == 1) {
			boolean isCarDriver = travel.isCarDriver(driver);
			System.out.println(isCarDriver);

		}

		Driver driver1 = new Driver(001, "car", "vijay", 500);
		Driver driver2 = new Driver(002, "car", "rohit", 1300);
		Driver driver3 = new Driver(003, "Auto", "Yogesh", 800);
		Driver driver4 = new Driver(004, "auto", "Sai", 800);
		Driver driver5 = new Driver(005, "car", "Tinku", 1800);
		Driver driver6 = new Driver(006, "car", "Mallesh", 100);

		ArrayList<Driver> totalDrivers = new ArrayList<Driver>();
		totalDrivers.add(driver1);
		totalDrivers.add(driver2);
		totalDrivers.add(driver3);
		totalDrivers.add(driver4);
		totalDrivers.add(driver5);
		totalDrivers.add(driver6);

		System.out.println("Enter your Id : ");
		int id = scanner.nextInt();
		switch (id) {
		case 001: {
			travel.retrivebyDriverId(totalDrivers, id);
			break;
		}
		case 002: {
			travel.retrivebyDriverId(totalDrivers, id);
			break;
		}
		case 003: {
			travel.retrivebyDriverId(totalDrivers, id);
			break;
		}
		case 004: {
			travel.retrivebyDriverId(totalDrivers, id);
			break;
		}
		case 005: {
			travel.retrivebyDriverId(totalDrivers, id);
			break;

		}
		case 006: {
			travel.retrivebyDriverId(totalDrivers, id);
			break;
		}
		default:
			System.out.println(" Invalid Id ");

		}

		System.out.println("Enter the Category of the Driver : ");
		String Category = scanner.next();
		travel.retriveCountOutDriver(totalDrivers, Category);
		System.out.print("  ");

		System.out.println("Enter Category for the Names of Drivers : ");
		System.out.println(" 1)Car ");
		System.out.println(" 2)Auto ");
		String driverCategory = scanner.next();
		travel.retriveDriver(totalDrivers, driverCategory);

		travel.retriveMaximumDistance(totalDrivers);

	}

}
