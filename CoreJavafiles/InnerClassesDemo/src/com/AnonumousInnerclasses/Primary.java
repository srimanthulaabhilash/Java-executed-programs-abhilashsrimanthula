package com.AnonumousInnerclasses;

class Secoundary {
	void methodP() {
		System.out.println("important");
	}

	public class Primary {

		public static void main(String[] args) {

			Secoundary secoundary = new Secoundary() {
				void methodP() {
					System.out.println("IMP");

				}

			};
			secoundary.methodP();
			Secoundary secoundary2 = new Secoundary();
			secoundary2.methodP();

		}

	}

}
