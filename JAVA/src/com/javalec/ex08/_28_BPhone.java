package com.javalec.ex08;

public class _28_BPhone implements _28_IFunction {

	@Override
	public String callSenderReceive() {
		return PCALLYES;
	}

	@Override
	public String calLte() {
		return FOUR_G;
	}

	@Override
	public String tvRemoteController() {
		return TVRMT_YES;
	}

	public String toString() {
		return BPHONE;
	}

}
