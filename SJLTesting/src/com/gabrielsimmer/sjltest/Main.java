package com.gabrielsimmer.sjltest;

import com.gabrielsimmer.sjl.Sjl;

public class Main {

	static Sjl Sjl = new Sjl(); // Make Java known who you're referring to
    							// Can technically be anything but for simplicity is Sjl
	
	public static void main(String[] args) {
		Sjl.print("Hello world!"); // Print out Hello World!
		
		Sjl.window(1280, 720, "test"); // Create a 1280x270 window with title test

		Sjl.playSound("http://www-mmsp.ece.mcgill.ca/Documents/AudioFormats/WAVE/Samples/AFsp/M1F1-Alaw-AFsp.wav");
        // Play the sound from the URL. Also works with local files somehow.
		
	}

}