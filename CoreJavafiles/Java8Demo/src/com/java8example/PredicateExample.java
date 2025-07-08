package com.java8example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", Name=" + Name + "]";
	}

	int sal;
	String Name;

	Employee(int sal, String Name) {
		this.sal = sal;
		this.Name = Name;
	}

}

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> predicate = (name) -> {
			return name.length() > 5;
		};
		System.out.println(predicate.test("abhilash"));

		Employee employee1 = new Employee(5000, "abhilash");
		Employee employee2 = new Employee(2000, "vijay");
		Employee employee3 = new Employee(1000, "AB");
		Employee employee4 = new Employee(1500, "CD");
		Employee employee5 = new Employee(1000, "EF");

		List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

//		for (Employee employee : list) {
//			if (employee.sal < 3000) {
//				System.out.println(employee.Name);
//			}
//
//		}

		list.stream().filter(employe0 -> employe0.sal < 3000).forEach(employe0 -> System.out.println(employe0.Name));

		List<Employee> finalList = list.stream().filter(employe0 -> employe0.sal < 3000).collect(Collectors.toList());

		System.out.println(finalList);
	}

}
