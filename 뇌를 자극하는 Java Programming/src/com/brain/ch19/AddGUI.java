package com.brain.ch19;
import java.awt.*;
import javax.swing.*;

public class AddGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Add");
		frame.setLocation(500, 400);
//		frame.setPreferredSize(new Dimension(250, 100));
		Container contentPane = frame.getContentPane();
		
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		JPanel panel = new JPanel();
		panel.add(new JTextField(6));
		panel.add(new JLabel("+"));
		panel.add(new JTextField(6));
		panel.add(new JLabel("="));
		panel.add(new JTextField(6));
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		panel2.add(new JButton("확인"));
		panel2.add(new JButton("취소"));
		contentPane.add(panel2, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
