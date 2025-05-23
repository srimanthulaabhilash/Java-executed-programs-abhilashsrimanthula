package com.java8example;

import java.util.*;

class User {
	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

class ComparatorAge implements Comparator<User> {
	public int compare(User u1, User u2) {
		return Integer.compare(u1.age, u2.age);
	}
}

public class Main {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("ramesh", 23));
		users.add(new User("virat", 12));
		users.add(new User("bala", 27));

		Collections.sort(users, new ComparatorAge());
		System.out.println(users);

		// ========================

		Comparator<User> ageComparator = new ComparatorAge().reversed();
		Collections.sort(users, ageComparator);
		System.out.println("===="+users);

		// ====================
		Comparator<User> multiComparator = Comparator.comparingInt((User u) -> u.age).thenComparing(u -> u.name);
		Collections.sort(users, multiComparator);
		System.out.println(users);
		
		//=================
		Comparator<User> nameComparator = Comparator.comparing(u -> u.name);
		Collections.sort(users, nameComparator);
		System.out.println(users);


	}
}
