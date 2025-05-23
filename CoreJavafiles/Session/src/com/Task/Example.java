package com.Task;

import java.util.Objects;

public class Example {

	private String name;
	private String city;

	Example(String name,String city){
			this.name=name;
			this.city=city;
		}

	@Override
	public int hashCode() {
		return Objects.hash(city, name);
//			return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Example other = (Example) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
//			return true;
	}

	

	@Override
	public String toString() {
		return "Example [name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
//		Example = new Department("Rizwan", "Andra");
//		Department e2 = new Department("Rohit", "Telangana");
//		Department e3 = new Department("Adithya", "Kerala");
//		Department e4 = new Department("Annawaram", "Goa");
//		Department e5 = new Department("Rizwan", "Andra");
//		HashSet a = new HashSet();
//		a.add(e1);
//		a.add(e2);
//		a.add(e3);
//		a.add(e4);
//		a.add(e5);
//		System.out.println(a);
//			System.out.println(e1.hashCode());
//		System.out.println(a.size());
//			System.out.println(e1.equals(e4));
//			String s="ady";
//			String s1=new String("ady");
//			System.out.println();
		StringBuffer s4 = new StringBuffer("Ady");
		StringBuffer s3 = new StringBuffer(s4);
		System.out.println(s3.equals(s4));
	}



}


