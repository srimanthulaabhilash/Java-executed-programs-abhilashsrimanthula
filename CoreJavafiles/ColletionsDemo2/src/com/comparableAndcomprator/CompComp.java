package com.comparableAndcomprator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CompComp {

	public static void main(String[] args) {
		Customer customer3 = new Customer(3, "sri");
		Customer customer2 = new Customer(2, "bala");
		Customer customer1 = new Customer(1, "ab");

		List<Customer> customers = Arrays.asList(customer1, customer2, customer3);
		Collections.sort(customers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}

		TreeSet set = new TreeSet(new MYCompratorExample());
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);
		System.out.println(set);

	}

}

class Customer implements Comparable<Customer> {
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + "]";
	}

	int ID;
	String name;

	public Customer(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	@Override
	public int compareTo(Customer obj) {
		int id1 = this.ID;
		Customer customer = (Customer) obj;
		int id2 = customer.ID;

		if (id1 > id2) {
			return +1;
		} else if (id1 < id2) {
			return -1;
		} else
			return 0;
	}
}

class MYCompratorExample implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customer customer1 = (Customer) o1;
		Customer customer2 = (Customer) o2;
		String s1 = customer1.name;
		String s2 = customer2.name;

		return s2.compareTo(s1);
	}

}
