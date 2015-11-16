package com.javalec.ex13;
import java.awt.*;
import javax.swing.*;
public class _03_AwtEx03 {
	public static void main(String[] args) {
		// Grid Layout은 주어진 영역을 똑같은 크기의 행과 열로 나누고,
		// 컴포넌트들을 그 크기에 맞게 만들어서 배치하는 레이아웃
		// 컴포턴트를 가로 또는 세로로 순서대로 배열한다.
		JFrame frame = new JFrame("Grid Layout");
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
