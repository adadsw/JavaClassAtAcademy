package com.javalec.ex13;
import java.awt.*;
import javax.swing.*;

public class _03_AwtEx03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		GridLayout layout = new GridLayout(4, 2);
		contentPane.setLayout(layout);
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("토끼"));
		contentPane.add(new JButton("다람쥐"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("강아지"));
		contentPane.add(new JButton("카멜레온"));
		contentPane.add(new JButton("고슴도치"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
