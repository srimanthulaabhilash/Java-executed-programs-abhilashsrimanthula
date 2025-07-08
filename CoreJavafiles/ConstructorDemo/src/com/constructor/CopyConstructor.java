package com.constructor;

class Person {
	String name;
	int Id;

	Person(String name, int id) {
		this.Id = id;
		this.name = name;
	}

	Person(Person x) {
		this.name = x.name;
		this.Id = x.Id;

	}
	void display() {
		 System.out.println("name : "+name +"id :"+Id);
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		 Person person=new Person("abhi", 3);
		 Person person2=new Person(person);
		 person.display();
		
		

	}

}
