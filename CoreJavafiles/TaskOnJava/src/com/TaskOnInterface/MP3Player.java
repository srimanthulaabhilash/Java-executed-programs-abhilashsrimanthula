package com.TaskOnInterface;

public class MP3Player implements MediaPlayer{
	@Override
	public void Play() {
		System.out.println("lets play the music ...");
	}

	public static void main(String[] args) {
		MP3Player mp3Player=new MP3Player();
		mp3Player.Play();
				
		

	}

}
