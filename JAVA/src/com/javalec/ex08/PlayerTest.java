package com.javalec.ex08;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new Player("운동선수");

		Player cha = new SoccerPlayer("차두리");
		cha.play(cha);
		((SoccerPlayer) cha).KickBall();

		Player hyun = new BasketballPlayer("현주엽");
		hyun.play(hyun);
		((BasketballPlayer) hyun).ThrowBall();
	}

}
