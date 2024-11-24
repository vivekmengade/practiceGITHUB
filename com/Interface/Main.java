package com.Interface;

public class Main {
	public static void main(String[] args) {
		MediaPlayer m = new VideoPlayer();
		m.Play();
		m.Pause();
		m.Stop();
		
		System.out.println("-----------------------");
		MediaPlayer V = new AudioPlayer();
		V.Play();
		V.Pause();
		V.Stop();
	}
}
