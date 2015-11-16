package com.javalec.ex13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _04_AwtEx {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fruit Basket program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("바나나"));
		contentPane.add(new JButton("딸기"));
		contentPane.add(new JButton("감"));
		contentPane.add(new JButton("홍시"));
		contentPane.add(new JButton("자두"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.pack();
		frame.setVisible(true);
	}

}
