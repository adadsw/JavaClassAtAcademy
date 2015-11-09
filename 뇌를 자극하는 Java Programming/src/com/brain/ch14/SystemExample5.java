package com.brain.ch14;

import java.util.Properties;

public class SystemExample5 {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.list(System.out);
	}

}
