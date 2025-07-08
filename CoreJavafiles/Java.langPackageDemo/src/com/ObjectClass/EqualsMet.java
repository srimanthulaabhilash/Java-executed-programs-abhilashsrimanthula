package com.ObjectClass;
/* ****reference comparision***** */

/*1. We can use this method to check equivalence of two objects.
2. If our class doesn't contain .equals() method then object class .equals() method
will be executed which is always meant for reference comparison[address
comparison]. i.e., if two references pointing to the same object then only .equals(
) method returns true .*/

public class EqualsMet {
	public int id;
	public String Name;

	EqualsMet(int id, String Name) {
		this.id = id;
		this.Name = Name;

	}

	public static void main(String[] args) {
		EqualsMet id0 = new EqualsMet(01, "srimanthula");
		EqualsMet id1 = new EqualsMet(02, "Abhi");
		EqualsMet id2 = new EqualsMet(03, "Akhilesh");
		EqualsMet id3 = id2;

		System.out.println(id0.equals(id1));
		System.out.println(id1.equals(id2));
		System.out.println(id3.equals(id2));

		/*
		 * In the above program Object class .equals() method got executed which is
		 * always meant for reference comparison that is if two references pointing to
		 * the same object then only .equals(() method returns true.
		 * 
		 * In object class .equals() method is implemented as follows which is meant for
		 * reference comparison
		 */
		System.out.println("Case 1===================");
//		In the case of primitives == (double equal
//				operator) meant for content comparison, but
//				in the case of object references == operator
//				meant for reference comparison.
		int id = 1;
		int id5 = 1;
		System.out.println(id == id5);

		System.out.println("Case 2: =======================");
		String string = "java";
		String string2 = "java";
		System.out.println(string.equals(string2));
//		If 2 objects are equal by .equals() method compulsory their hashcodes must be
//		equal (or) same. That is Ifr1.equals(r2) is true then r1.hascode()==r2.hashcode( )
//		must be true.
		System.out.println(string.hashCode() == string2.hashCode());

	}

}
