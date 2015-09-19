package com.gabrielsimmer.sjl;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sjl {

	public void print(String string){
		System.out.println(string); //Print out whatever is passed to sjl.print();
	}

	public void window(int width, int height, String name){
		JFrame frame = new JFrame(name);
		frame.setSize(width, height);
		frame.setVisible(true); // Create window
	}

	public void playSound(String file){
		try {
			java.applet.AudioClip clip = java.applet.Applet.newAudioClip(
					new java.net.URL(file));
			clip.play();
		} catch (java.net.MalformedURLException murle) {
			System.out.println(murle); // Play sound
		}
	}
	
	public void displayImg(String file){
		BufferedImage img = null; // Java uses BufferedImage for images
		
		try {
			img = ImageIO.read(new File(file)); // Read the file to the BufferedImage
			JFrame frame = new JFrame("file"); // Create a new window
			frame.setSize(img.getHeight(), img.getWidth()); // Set window to width/height of image
			JLabel lblimage = new JLabel(new ImageIcon(img)); // Set which image to display
			frame.getContentPane().add(lblimage, BorderLayout.CENTER); // Put the image in the middle of the JFrame
			frame.setVisible(true); // Create window
			
		}catch(Exception e){ // If something goes wrong, assume it's the image
			print("File not found!");
		}
	}
	public void displayImg(String file, int width, int height){
		
	}
	

}
