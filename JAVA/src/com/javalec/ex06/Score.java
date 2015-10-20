package com.javalec.ex06;

public class Score {
	// 변수
	int koreanScore = 0;
	int englishScore = 0;
	int mathScore = 0;
	int sum;
	float avg;
	String grade;

	// 메서드
	void getTot() {
		sum = koreanScore + englishScore + mathScore;
	}

	void getAvg() {
		avg = sum / 3f;
		avg = Math.round(avg * 100) / 100f;
	}

	void getGrade() {
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		if (avg % 10 >= 5 && grade != "F") {
			grade += "+";
		} else if (avg % 10 < 5 && grade != "F") {
			grade += "-";
		}
	}

	// 생성자
	Score() {

	}

	Score(int koreanScore, int englishScore, int mathScore) {
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

}
