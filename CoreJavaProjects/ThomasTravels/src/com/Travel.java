package com;

import java.util.ArrayList;
import java.util.Collections;

public class Travel {
	/* method to check the registered driver is belongs to car or not */
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equalsIgnoreCase("car");

	}

	/*
	 * This method will search the given driverId in the arraylist and returns the
	 * String in the following format
	 */
	public String retrivebyDriverId(ArrayList<Driver> totalDrivers, int searchingDriverId) {
		for (Driver driver : totalDrivers) {
			int currentDriverId = driver.getDriverId();
			if (currentDriverId == searchingDriverId) {
				System.out.println("*User Found Successfully!!*");
				try {
					System.out.println("Loading _ _ _ ");

					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String Responce = "Driver name is " + driver.getDriverName() + " Belonging to the category "
						+ driver.getCategory() + " traveled " + driver.getTotalDistance() + "KM so far.  ";
				System.out.println(Responce);
				return Responce;
			}
		}
		return "";
	}

	/*
	 * This method will category of driver and an arraylist of driver as input and
	 * search for an category and returns the count of drivers.
	 */
	public int retriveCountOutDriver(ArrayList<Driver> totalDrivers, String category) {

		int count = 0;
		for (Driver driver : totalDrivers) {
			String categoryDriver = driver.getCategory();
			if (categoryDriver != null && categoryDriver.equalsIgnoreCase(category)) {
				count++;
			}

		}
		System.out.println("Number of Drivers of " + category + " is : " + count);
		return count;

	}

	/*
	 * This method will category of driver and an arraylist of driver as input and
	 * search for an category. and drivers who are belonging to that category should
	 * be return as a array list.
	 */
	public ArrayList<String> retriveDriver(ArrayList<Driver> totalDrivers, String categoryDriver) {
		ArrayList<String> particularDrivers = new ArrayList<String>();
		for (Driver driver : totalDrivers) {
			if (driver.getCategory().equalsIgnoreCase(categoryDriver)
					|| driver.getCategory().equalsIgnoreCase(categoryDriver)) {
				particularDrivers.add(driver.getDriverName());
			}
		}
		System.out.println("Drivers for " + categoryDriver + " is : " + particularDrivers);
		return particularDrivers;

	}

	public void retriveMaximumDistance(ArrayList<Driver> totalDrivers) {
		Driver maxDistance = totalDrivers.get(0);
		for (Driver driver : totalDrivers) {
			if (driver.getTotalDistance() > maxDistance.getTotalDistance()) {
				maxDistance = driver;

			}

		}
		System.out.println("Driver with the maximum distance is: " + maxDistance);

	}

}
