package com.serilization.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serialization in Java allows us to convert an Object to stream that we can send over the network
//or save it as file or store in DB for later usage.

class Ballon implements Serializable {
	private static final long serialID = 1L;
	String color;
	int size;

	Ballon(String color, int size) {
		this.color = color;
		this.size = size;
	}

	void display() {
		System.out.println("color : " + color + "size : " + size);
	}

}

public class SsrilazationEx {

	public static void main(String[] args) {
//		The process of saving (or) writing state of an object to a file is called serialization
//		2. but strictly speaking it is the process of converting an object from java supported
//		form to either network supported form (or) file supported form.
//		3. By using FileOutputStream and ObjectOutputStream classes we can achieve
//		serialization process.
//		4. Ex: big ballon

		Ballon ballon = new Ballon("red ", 2);
		ballon.display();
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Ballon.ser");
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(ballon);
			System.out.println(" Serilazation is  Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream stream = new FileInputStream("Ballon.ser");
			ObjectInputStream inputStream = new ObjectInputStream(stream);
			Ballon ballon2 = (Ballon) inputStream.readObject();
			ballon2.display();
			System.out.println("Deserilaization Done");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
