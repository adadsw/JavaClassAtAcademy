package com.brain.ch16;

public class PiggyBank {
	int total;
	Slot slot;

	PiggyBank() {
		total = 0;
		slot = new Slot();
	}

	class Slot {
		void put(int amount) {
			total += amount;
		}
	}
}

class PiggyBank2 {
	int total;
	
	PiggyBank2() {
		total = 0;
	}
	void put(int amount) {
		total += amount;
	}
}