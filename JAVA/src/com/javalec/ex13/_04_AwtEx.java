package com.javalec.ex13;

import javax.swing.*;
import java.awt.*;

public class _04_AwtEx {
	public static void main(String[] args) {

		// flow layout을 사용하는 프로그램
		// 좌에서 우로 컴포넌트를 배열하다가 폭이 모자라면 줄을 바꿔서 계속 배열하는 레이아웃 
		JFrame frame = new JFrame("Fruit Basket program"); //윈도우 만들고
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane(); //패널 만들고
		FlowLayout layout = new FlowLayout(); //위에서 만든 레이아웃
		contentPane.setLayout(layout); // 위에서 만든 레이아웃 붙여
//		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("사과"));	//패널에 내용 추가
		contentPane.add(new JButton("바나나"));
		contentPane.add(new JButton("딸기"));
		contentPane.add(new JButton("감"));
		contentPane.add(new JButton("홍시"));
		contentPane.add(new JButton("자두"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
