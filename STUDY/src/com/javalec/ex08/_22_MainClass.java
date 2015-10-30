package com.javalec.ex08;

public class _22_MainClass {
	public static void main(String[] args) {
		_22_StarCar low = new _22_StarCarLowGrade(_22_CarSpecs.COLOR_BLUE, _22_CarSpecs.TIRE_NORMAL, _22_CarSpecs.DISPLACEMENT_2000, _22_CarSpecs.HANDLE_NORMAL);
		_22_StarCar high = new _22_StarCarHighGrade(_22_CarSpecs.COLOR_RED, _22_CarSpecs.TIRE_WIDE, _22_CarSpecs.DISPLACEMENT_2200, _22_CarSpecs.HANDLE_POWER);
		
		low.getSpec();
		high.getSpec();
	}

}
