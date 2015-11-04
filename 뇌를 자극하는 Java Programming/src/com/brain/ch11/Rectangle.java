package com.brain.ch11;

public class Rectangle implements Cloneable {
	
	int width, height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Object clone() {
		try {
			return super.clone();
		} 
		catch (CloneNotSupportedException e) {
			return null;
		} 
		
	}

}
