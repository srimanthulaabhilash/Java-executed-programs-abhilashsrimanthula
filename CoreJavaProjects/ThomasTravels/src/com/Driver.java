package com;

public class Driver {
	private String category;
	private int driverId;
	private String driverName;
	private double totalDistance;

	Driver() {

	}

	public Driver(int driverId, String category, String driverName, double totalDistance) {
		super();
		this.driverId = driverId;
		this.category = category;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}

	/*
	 * public static void main(String[] args) { Driver driver = new Driver(); Driver
	 * driver1 = new Driver(01, "Car", "Ramesh", 1500); Driver driver2 = new
	 * Driver(02, "Lorry", "Suresh", 1000); }
	 */

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

}
