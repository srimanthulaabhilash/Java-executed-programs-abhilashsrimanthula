package com.java8example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		Supplier<Double> supplier = () -> Math.random();
		System.out.println(supplier.get());

		List<Dress> dresses = new ArrayList<Dress>();
		Dress d1 = new Dress("red", "black", "1");
		Dress d2 = new Dress("black", "blue", "1");
		Dress d3 = new Dress("green", "black", "1");

		dresses.add(d1);
		dresses.add(d2);
		dresses.add(d3);

		Supplier<Dress> supplier2 = () -> {
			Dress d = null;
			if (!dresses.isEmpty()) {
				d = dresses.get(0);
				dresses.remove(dresses.get(0));

			}
			return d;
		};
		for (int i = 0; i < 10; i++) {
			Dress suppliedDress = supplier2.get();
			if (null != suppliedDress) {
				System.out.println(suppliedDress.toString());
			} else {
				System.out.println("Out of Stock");
			}

		}

	}

}

class Dress {
	String pant;
	String shirt;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	String Id;

	public String getPant() {
		return pant;
	}

	public void setPant(String pant) {
		this.pant = pant;
	}

	public String getShirt() {
		return shirt;
	}

	public void setShirt(String shirt) {
		this.shirt = shirt;
	}

	public Dress(String pant, String shirt, String id) {
		super();
		this.pant = pant;
		this.shirt = shirt;
		Id = id;
	}

	@Override
	public String toString() {
		return "Dress [pant=" + pant + ", shirt=" + shirt + ", Id=" + Id + "]";
	}

}
