package com.javalec.ex13;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
public class _02_AwtEx02 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(200, 70));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label = new JLabel("불금");
		
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		ActionListener listener = new _02_ConfirmButtonActionListener(text, label);
		button.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 2단계 윈도우를 디스플레이 한다.
		frame.pack();
		frame.setVisible(true);
	}

}
