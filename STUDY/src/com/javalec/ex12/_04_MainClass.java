package com.javalec.ex12;

public class _04_MainClass {
	public static void main(String[] args) {
		_04_VoteThreadEx voteLocation1 = new _04_VoteThreadEx();
		_04_VoteThreadEx voteLocation2 = new _04_VoteThreadEx();
		_04_VoteThreadEx voteLocation3 = new _04_VoteThreadEx();
		
		Thread location1 = new Thread(voteLocation1, "location1");
		Thread location2 = new Thread(voteLocation2, "location2");
		Thread location3 = new Thread(voteLocation3, "location3");
		
		location1.start();
		location2.start();
		location3.start();
	}
}
