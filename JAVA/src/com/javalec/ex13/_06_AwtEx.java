package com.javalec.ex13;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

public class _06_AwtEx {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TableTest");
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		String colName[] = { "NAME", "AGE", "SEX" };
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		
		// 표 형태로 데이터를 보여주는 Table Conponent
		// 모델 : 테이블에 새로운 행을 추가하거나 삭제하는 기능을 함
		// 모델에 데이터를 저장하는 테이블 생성
		
		JTable table = new JTable(model);
		// contentPane위에 스크롤바를 생성해서 올리겠다.
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		JPanel panel = new JPanel();

		JTextField text1 = new JTextField(6); // 6자리
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JButton button1 = new JButton("add");
		JButton button2 = new JButton("del");
		
		panel.add(new JLabel("NAME"));
		panel.add(text1);
		panel.add(new JLabel("AGE"));
		panel.add(text2);
		panel.add(new JLabel("SEX"));
		panel.add(text3);
		panel.add(button1);
		panel.add(button2);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		ActionListener listener = new _06_AddActionListener(table, text1, text2, text3);
		button1.addActionListener(listener);
		button2.addActionListener(new _06_RemoveActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
