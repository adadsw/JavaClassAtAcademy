package com.brain.ch16;

public interface PlaneObject {
	Location getLocation();
	void setLocation(int x, int y);
	static class Location {
		int x, y;
		Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
