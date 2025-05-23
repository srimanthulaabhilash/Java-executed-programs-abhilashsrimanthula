package com.ObjectClass;
/*When ever we are overriding .equals() method we have to consider the following
things :
1. Meaning of content comparison i.e., whether we have to check the names
are equal (or) roll numbers (or) both are equal.
2. If we are passing different type of objects (heterogeneous object) our
.equals() method should return false but not ClassCastException i.e., we
have to handle ClassCastException to return false.
3. If we are passing null argument our .equals() method should return false
but not NullPointerException i.e., we have to handle
NullPointerException to return false.
4. The following is the proper way of overriding .equals() method for
content comparison in Student class.*/

public class EqualsMet2 {
	public int id;
	public String Name;

	EqualsMet2(int id, String Name) {
		this.id = id;
		this.Name = Name;

	}

	@Override
	public boolean equals(Object obj) {
		try {
			EqualsMet2 other = (EqualsMet2) obj;

			String Name = other.Name;
			int id1 = other.id;

			if (Name.equals(Name) && id == id1) {
				return true;

			} else {
				return false;
			}

		} catch (Exception e) {

		}
		return false;

	}

	public static void main(String[] args) {
		EqualsMet2 e = new EqualsMet2(01, "abc");
		EqualsMet2 e1 = new EqualsMet2(02, "abc");
		System.out.println(e.equals(e1));

		System.out.println("=======================");

		String string = "abc";
		String string2 = "abk";
		System.out.println(string == string2);// if string and string2 are equal by == operator then it is also equal by
												// .equals method.
												// and if two string are not equal by == operator then .equals operator
												// is also false
		System.out.println(string.equals(string2));

	}

}
