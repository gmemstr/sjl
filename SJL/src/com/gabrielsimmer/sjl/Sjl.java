package com.gabrielsimmer.sjl;

import javax.swing.JFrame;

public class Sjl {

	public void print(String string){
		System.out.println(string);
	}

	public void window(int width, int height, String name){
		JFrame frame = new JFrame(name);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

	public void playSound(String file){
		try {
			java.applet.AudioClip clip = java.applet.Applet.newAudioClip(
					new java.net.URL(file));
			clip.play();
		} catch (java.net.MalformedURLException murle) {
			System.out.println(murle);
		}
	}

}
