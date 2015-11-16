package com.javalec.ex13;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class _07_DrawActionListener implements ActionListener {
	JTextField text1, text2, text3;
	_07_DrawingPanel drawingPanel;
	
	_07_DrawActionListener(_07_DrawingPanel drawingPanel, JTextField text1, JTextField text2, JTextField text3) {
		this.drawingPanel = drawingPanel;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			drawingPanel.setScores(korean, english, math);
			drawingPanel.repaint();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(drawingPanel, "잘못된 숫자 포맷입니다.", "에러메시지", JOptionPane.ERROR_MESSAGE);
		}
	}

}
