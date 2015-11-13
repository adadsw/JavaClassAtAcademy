package com.brain.ch19;
import java.awt.*;
import javax.swing.*;
public class WindowExample7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setLocation(500, 400);
		frame.setPreferredSize(new Dimension(300, 150));
		Container contentPane = frame.getContentPane();
		
		String colNames[] = { "이름", "나이", "성별" };
		Object data[][] = { { "김철수", 24, '남' },
							{ "이순희", 21, '여' },
							{ "박지영", 26, '여' } };
		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JButton button = new JButton("출력");
		button.addActionListener(new PrintActionListener(table));
		contentPane.add(button, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
