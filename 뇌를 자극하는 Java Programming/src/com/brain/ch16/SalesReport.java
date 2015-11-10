package com.brain.ch16;

import java.util.ArrayList;

public class SalesReport {
	int year; 			// 연도
	byte quarter; 		// 4분기: 1, 2, 3, 4
	ArrayList<Record> list = new ArrayList<Record>();
	SalesReport(int year, byte quarter) {
		this.year = year;
		this.quarter = quarter;
	}

	void addRecord(String name, int num, int amount) {
		list.add(new Record(name, num, amount));
	}

	int getTotal() {
		int total = 0;
		for (Record record: list)
			total += record.num;
		return total;
	}

	class Record {
		String name;
		int num;
		int amount;
		Record(String name, int num, int amount) {
			this.name = name;
			this.num = num;
			this.amount = amount;
		}
	}
}
