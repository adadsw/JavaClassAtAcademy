package com.javalec.ex06;

public class Score2 {
	// 변수
	int kor = 0;
	int eng = 0;
	int mat = 0;
	
	// 생성자
	Score2() {
		//8. this() 생성자를 활용해서 매개변수가 있는 생성자를 호출
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

	// 3. sum 결과값을 메인의 result에 반환한다.
	int getTotal(int kor, int eng, int mat) {
		int sum;
		sum = kor + eng + mat;
		return sum;
	}

	float getAvg(float sum) {
		float avg;
		avg = sum;
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
