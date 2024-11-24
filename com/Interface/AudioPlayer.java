package com.Interface;

public class AudioPlayer implements MediaPlayer {

	@Override
	public
	void Play(){
		System.out.println("audio is playing");
	}
	@Override
	public
	void Pause() {
		System.out.println("Audio is paused");
	}
	@Override
	public
	void Stop() {
		System.out.println("Audio is Stopped");
	}
}
