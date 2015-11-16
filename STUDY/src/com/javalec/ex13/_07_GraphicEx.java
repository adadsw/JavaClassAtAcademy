package com.javalec.ex13;
import java.awt.*;

import javax.swing.*;

public class _07_GraphicEx {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("성적 프로그램");
		frame.setLocation(500, 400);
		frame.setPreferredSize(new Dimension(350, 500));
		Container contentPane = frame.getContentPane();
		
		_07_DrawingPanel drawingPanel = new _07_DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		
		JPanel contentJPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JButton button = new JButton("그래프 그리기");
		contentJPanel.add(new JLabel("국어"));
		contentJPanel.add(text1);
		contentJPanel.add(new JLabel("수학"));
		contentJPanel.add(text2);
		contentJPanel.add(new JLabel("영어"));
		contentJPanel.add(text3);
		contentJPanel.add(button);
		contentPane.add(contentJPanel, BorderLayout.SOUTH);
		
		button.addActionListener(new _07_DrawActionListener(drawingPanel, text1, text2, text3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
}
