package com.TaskOnInterface2;

public class DocumentPrinter implements Printer {
	@Override//we can override the default method of intrface in the child class
	public void  printDetails() {
		System.out.println("Printind Document..");
	} 

	public static void main(String[] args) {
		DocumentPrinter documentPrinter = new DocumentPrinter();
		documentPrinter.printDetails();

	}

}
