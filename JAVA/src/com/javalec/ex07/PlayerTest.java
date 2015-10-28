package com.javalec.ex07;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new Player("운동선수");

		Player cha = new SoccerPlayer("차두리");
		cha.play();
		((SoccerPlayer) cha).KickBall();

		Player hyun = new BasketballPlayer("현주엽");
		hyun.play();
		((BasketballPlayer) hyun).ThrowBall();

	}

}
