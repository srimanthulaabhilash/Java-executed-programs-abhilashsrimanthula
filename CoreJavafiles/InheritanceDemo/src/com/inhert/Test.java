package com.inhert;

import java.util.Objects;

public class Test {
	
	int empolyeeId;
	String employeAdress;
	String employeName;
	int referalId;
	
	
	public Test(int empolyeeId, String employeAdress, String employeName, int referalId) {
		super();
		this.empolyeeId = empolyeeId;
		this.employeAdress = employeAdress;
		this.employeName = employeName;
		this.referalId = referalId;

	
	}

	public static void main(String[] args) {
		Test t = new Test(8, "hyd", "ab", 5);
		System.out.print(t);
		
	}

	@Override
	public String toString() {
		return "Test [empolyeeId=" + empolyeeId + ", employeAdress=" + employeAdress + ", employeName=" + employeName
				+ ", referalId=" + referalId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeAdress, employeName, empolyeeId, referalId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return Objects.equals(employeAdress, other.employeAdress) && Objects.equals(employeName, other.employeName)
				&& empolyeeId == other.empolyeeId && referalId == other.referalId;
	}

}
