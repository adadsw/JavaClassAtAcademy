package com.javalec.ex07;

public class _03_ChildMenu extends _03_ParentMenu {

	public _03_ChildMenu() {
	}

	public void makeKongNaMool() {
		System.out.println("콩나물국");
	}
	
	@Override
	public void makeChungGukJang() {
		System.out.println("냄새없는 청국장");
	}
	
	@Override
	public void makeDoenJangGuk() {
		System.out.println("매운 된장국");
	}
}
