package com.javalec.ex06;

public class Score2 {
	int kor = 0;
	int eng = 0;
	int mat = 0;

	Score2() {
		this(98, 84, 75);
	}

	Score2(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("수학 : " + this.mat);

	}

	int getTotal(int kor, int eng, int mat) {
		int sum;
		sum = kor + eng + mat;
		return sum;
	}

	float getAvg(float sum) {
		float avg = (float) sum / 3;
		avg = Math.round(avg * 100) / 100f;
		return avg;
	}

	String getGrade(float avg) {
		String grade;
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
		return grade;
	}

}
