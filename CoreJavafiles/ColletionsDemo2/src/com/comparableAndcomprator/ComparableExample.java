package com.comparableAndcomprator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	/*
	 * Comparable Interface Present in java.lang Package and it contains Only One
	 * Method compareTo().=>An object is said to be Comparable if and only if
	 * corresponding class implements Comparable interface. All Wrapper Classes,
	 * String Class Already Implements Comparable Interface. But StringBuffer Class
	 * doesn't Implement Comparable Interface
	 * 
	 */
	public static void main(String[] args) {
		Student student1 = new Student(001, "abhilash", 34);
		Student student2 = new Student(002, "sai", 75);
		Student student3 = new Student(004, "madhu", 90);
		Student student4 = new Student(005, "srinu", 68);
		Student student5 = new Student(003, "vinay", 83);

		List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);
		Collections.sort(list);
		/*
		 * Internally, Java calls compareTo() on each Stutent object to determine their
		 * order.
		 */
		for (Student student : list) {
			System.out.println(student);
		}
	}
}

class Student implements Comparable<Student> {

	private int studentId;
	private String studentName;
	private int studentMarks;

	public Student(int studentId, String studentName, int studentMarks) {
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}

	@Override
	public int compareTo(Student student) {
		if (this.getStudentMarks() > student.getStudentMarks()) {
			return 1;
		} else if (this.getStudentMarks() < student.getStudentMarks()) {
			return -1;
		}
		return 0;
	}

//	@Override
//	public int compareTo(Student student) {
//		return this.getStudentName().compareTo(student.studentName);
//	}
//	@Override
//	public int compareTo(Student student) {
//		if (this.getStudentId() > student.studentId) {
//			return 1;
//		}
//		return -1;
//	}

}
