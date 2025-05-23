package com.collections.classmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortComprator {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Ramesh", 24));
		persons.add(new Person("Suresh", 29));
		persons.add(new Person("Chezz", 32));

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {

				return Integer.compare(p1.Age, p2.Age);
			}
		});
		System.out.println(persons);
		System.out.println("using Lambda ");
		Collections.sort(persons, (p1, p2) -> Integer.compare(p1.Age, p2.Age));

	}

}

class Person {
	String Name;
	int Age;

	public Person(String name, int age) {
		super();
		Name = name;
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}

}
