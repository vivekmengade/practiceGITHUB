package com.Interface;

public class VideoPlayer implements MediaPlayer{

	@Override
	public
	void Play(){
		System.out.println("Video is Playing");
	}
	@Override
	public
	void Pause() {
		System.out.println("Video is Paused");
	}
	@Override
	public
	void Stop() {
		System.out.println("Video is Stopped");
	}
}
