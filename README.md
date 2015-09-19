# sjl
simple java library for learning how to use java

## goal of this library

this library is intended to provide a very simple baseline for working with java by simplefying much of the more advanced syntax into quick and memorable lines.

## using the library

```java
import com.gabrielsimmer.sjl.Sjl; // Main import

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

```

## current methods

> Assuming Sjl.`method`

|Method|Function|
|---|---|
|print(String)|Print a string|
|window(int, int, String)|Create a blank window with desired size and title|
|playSound(String)|Play .wav file from URL|