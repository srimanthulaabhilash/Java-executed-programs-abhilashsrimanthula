package com.TaskOnInterface;

public interface Playable {
	void methodPlay();

}

class Guitar implements Playable {

	@Override
	public void methodPlay() {
		System.out.println("guitar plays");
	}

	public static void main(String[] args) {
		Guitar guitar = new Guitar();
		guitar.methodPlay();
	}

}

class Paino implements Playable {

	@Override
	public void methodPlay() {
		System.out.println("paino plays");
	}

	public static void main(String[] args) {
		Paino paino = new Paino();
		paino.methodPlay();
	}

}
