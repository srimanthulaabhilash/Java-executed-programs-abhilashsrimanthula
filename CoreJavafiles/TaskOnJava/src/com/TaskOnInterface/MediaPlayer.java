package com.TaskOnInterface;

public interface MediaPlayer {
	default void Play() {
		System.out.println("Playing media");
	}
	static void stops() {
		System.out.println("stopping media");
		
	}
}
