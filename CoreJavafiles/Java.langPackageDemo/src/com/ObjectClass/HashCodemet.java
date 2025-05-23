package com.ObjectClass;

public class HashCodemet {
	/*
	 * 1. For every object jvm will generate a unique number which is nothing but
	 * hashCode. 2. Jvm will using hashCode while saving objects into hashing
	 * related data structures like HashSet, HashMap, and Hashtable etc. 3. If the
	 * objects are stored according to hashCode searching will become very efficient
	 * (The most powerful search algorithm is hashing which will work based on
	 * hashCode). 4. If we didn't override hashCode() method then Object class
	 * hashCode() method will be executed which generates hashCode based on address
	 * of the object but it doesn't mean hashCode represents address of the object.
	 * 5. Based on our programming requirement we can override hashCode() method to
	 * generate our own hashcode. 6. Overriding hashCode() method is said to be
	 * proper if and only if for every object we have to generate a unique number as
	 * hashcode for every object.
	 */
	static int id;

	@Override
	public int hashCode() {
		return id;

	}

	public HashCodemet(int id) {
		this.id = id;

	}
	@Override
	public String toString() {
		return id + " ";
	}

	public static void main(String[] args) {
		HashCodemet codemet = new HashCodemet(0);
		System.out.println(codemet);

		HashCodemet codemet1 = new HashCodemet(1);
		System.out.println(codemet1);
		/*
		 * if we are not overriding to string or hashcode method then the object class
		 * methods will be executed
		 * 
		 * if we are giving opportunity to Object class toString() method it internally
		 * calls hashCode() method. But if we are overriding toString() method it may
		 * not call hashCode() method.
		 * 
		 *  2. We can use toString() method while printing
		 * object references and we can use hashCode() method while saving objects into
		 * HashSet or Hashtable or HashMap
		 */

	}

	

}
