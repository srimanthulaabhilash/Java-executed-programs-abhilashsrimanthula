package com.durgajava8;

import java.util.*;
import java.util.function.Function;

class Student {
	String name;
	int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
}

class Admission {
	String className;

	public Admission(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Admission open for: " + className;
	}
}

public class TransferCertificate {
	public static void main(String[] args) {
		List<String> empty = Arrays.asList("Grade 5", "Grade 6", "Grad 7");

		Function<Student, Admission> transferCertificate = (student) -> {
			for (String className : empty) {
				if (className.contains(String.valueOf(student.grade))) {
					return new Admission(className);
				}
			}
			return new Admission("No Seat");
		};

		Student student1 = new Student("Abhi", 6);
		Admission admission = transferCertificate.apply(student1);
		System.out.println(admission);
	}
}
