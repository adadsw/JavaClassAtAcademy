package com.javalec.ex13;

import javax.swing.*;
import java.awt.*;

public class _07_GraphicEx {
	public static void main(String[] args) {

		// 프래임과 컨테이너 생성, 할당
		JFrame frame = new JFrame("성적 프로그램");
		frame.setLocation(500, 200);
		frame.setPreferredSize(new Dimension(400, 350));
		Container contentPane = frame.getContentPane();
		
		// 패널 1. 그래프
		_07_DrawingPanel drawingPanel = new _07_DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		
		// 패널 2. 국어, 수학, 영어 점수와 그리기 버튼
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

		
		// 버튼 기능 부여
		button.addActionListener(new _07_DrawActionListener(drawingPanel, text1, text2, text3));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
