package com.javalec.ex13;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class _07_DrawingPanel extends JPanel {

	int korean, english, math;

	// 그래프를 그린다.
	public void paint(Graphics g) {

		// 패널 전체를 흰색으로 클리어한다.
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);

		// 좌표를 그린다.
		for (int i = 1; i < 11; i++) {
			g.drawString(i * 10 + "", 25, 255 - 20 * i);
			g.drawLine(50, 250 - 20 * i, 350, 250 - 20 * i);
		}

		g.drawLine(50, 20, 50, 250);
		g.drawString("국어", 100, 270);
		g.drawString("영어", 200, 270);
		g.drawString("수학", 300, 270);
		g.setColor(Color.red);

		// 막대그래프
		if (korean > 0)
			g.fillRect(110, 250 - korean * 2, 10, korean * 2);
		if (english > 0)
			g.fillRect(210, 250 - english * 2, 10, english * 2);
		if (math > 0)
			g.fillRect(310, 250 - math * 2, 10, math * 2);

	}

	// 점수필드값을 설정하는 메서드
	void setScores(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

}
