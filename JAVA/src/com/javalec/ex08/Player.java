package com.javalec.ex08;

public class Player {

	String player;

	Player() {}
	Player(String player) {
		this.player = player;
	}

	void play(Player player) {
		if (player instanceof SoccerPlayer) {
			System.out.print("축구선수가 ");
		}
		
		else if (player instanceof BasketballPlayer) {
			System.out.print("농구선수가 ");
		}
			
		System.out.println("운동한다");
	}
}


class SoccerPlayer extends Player {

	SoccerPlayer() {}
	SoccerPlayer(String player) {
		super(player);
	}

	void KickBall() {
		System.out.println(player + "가 축구한다");
	}
}


class BasketballPlayer extends Player {

	BasketballPlayer() {}
	BasketballPlayer(String player) {
		super(player);
	}

	void ThrowBall() {
		System.out.println(player + "이 농구한다");
	}
}