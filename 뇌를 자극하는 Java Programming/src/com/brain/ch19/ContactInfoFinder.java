package com.brain.ch19;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class ContactInfoFinder {
	public static void main(String[] args) {
		JFrame frame = new JFrame("연락처 검색 프로그램");
		frame.setPreferredSize(new Dimension(500, 200));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(5);
		JButton button = new JButton("검색");
		
//		button.addActionListener(new SearchActionListener(table, text1, text2, text3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
