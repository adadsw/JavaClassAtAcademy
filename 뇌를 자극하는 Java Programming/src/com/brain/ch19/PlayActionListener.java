package com.brain.ch19;

import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import java.io.File;

public class PlayActionListener implements ActionListener {
	JTextField text;
	PlayActionListener(JTextField text) {
		this.text = text;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			File file = new File(text.getText());
			AudioClip audioClip = Applet.newAudioClip(file.toURL());
			audioClip.play();
		} catch (MalformedURLException mue) {
			JOptionPane.showMessageDialog(text, "잘못된 파일명입니다.", "에러 메시지", JOptionPane.ERROR_MESSAGE);
		}
	}
}
