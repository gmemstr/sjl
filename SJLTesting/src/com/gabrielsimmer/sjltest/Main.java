package com.gabrielsimmer.sjltest;

import com.gabrielsimmer.sjl.Sjl;

public class Main {

	static Sjl Sjl = new Sjl();
	
	public static void main(String[] args) {
		Sjl.print("Hello world!");
		
		Sjl.window(1280, 720, "test");

		Sjl.playSound("http://www-mmsp.ece.mcgill.ca/Documents/AudioFormats/WAVE/Samples/AFsp/M1F1-Alaw-AFsp.wav");
		
	}

}
