package com.javalec.ex13;
import javax.swing.*;
import java.awt.event.*;

public class _02_ConfirmButtonActionListener implements ActionListener {

	private JTextField text;
	private JLabel label;
	
	public _02_ConfirmButtonActionListener(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("Hello, " + text.getText());
	}
}
