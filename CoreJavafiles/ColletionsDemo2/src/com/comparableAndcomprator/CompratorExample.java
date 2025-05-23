package com.comparableAndcomprator;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

//This Interface Present in java.util Package.
public class CompratorExample {
//	****Comparable Meant for Default Natural Sorting Order whereas
//	****Comparator Meant for Customized Sorting Order
	public static void main(String[] args) {
		Employe employe1 = new Employe(01, "abhilash", 67);
		Employe employe2 = new Employe(02, "akhi", 59);
		Employe employe3 = new Employe(03, "ajay", 80);
		Employe employe4 = new Employe(04, "rohit", 82);
		Employe employe5 = new Employe(05, "vijay", 59);

		List<Employe> employeslist = Arrays.asList(employe1, employe2, employe3, employe4, employe5);

		for (Employe employe : employeslist) {
			System.out.println(employe);
		}
		System.out.println("Sorting based on the name length : ");
		employeslist.sort(Comparator.comparingInt(employe -> employe.getEmployeName().length()));
		for (Employe employe : employeslist) {
			System.out.println(employe);
		}
//		employeslist.forEach(System.out::println);
		System.out.println("sorted based on the  Employe score : ");
		employeslist.sort(Comparator.comparingInt(Employe -> Employe.getEmployeScore()));
		for (Employe Employe : employeslist) {
			System.out.println(Employe);
		}
	}
}

class Employe implements Comparator<Employe> {

	private int employeId;
	private String employeName;
	private int employeScore;

	public Employe(int employeId, String employeName, int employeScore) {
		this.employeId = employeId;
		this.employeName = employeName;
		this.employeScore = employeScore;

	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public int getEmployeScore() {
		return employeScore;
	}

	public void setEmployeScore(int employeScore) {
		this.employeScore = employeScore;
	}

	@Override
	public String toString() {
		return "Employe [employeId=" + employeId + ", employeName=" + employeName + ", employeScore=" + employeScore
				+ "]";
	}

	@Override
	public int compare(Employe employe1, Employe employe2) {
		if (employe1.getEmployeName().length() > employe2.getEmployeName().length()) {
			return 1;
		}
		return -1;
	}

}
