// 퀴즈
package com.javalec.ex06;

public class ComputeScore3 {
	public static void main(String[] args) {
		// 1. 매개변수를 이용한 생성자 호출
		Score2 score = new Score2(98, 84, 75);

		//멤버변수 kor, eng, mat값을 받아와서 get Total의 매개변수로 넣는다.
		//2. 가져온 멤버변수값을 getTotal의 매개변수로 넣고 호출
		//4. int result로 return 받는다.
		//5.result값을 출력하라.
		int result = score.getTotal(score.kor, score.eng, score.mat);
		
		//합계 출력
		System.out.println("합계 : " + result);
		
		//6. 평균출력 : result / 3을 매개변수로 넣어서 평균값을 리턴받는다. 
		float avg = score.getAvg(result / 3f);
		System.out.println("평균 : " + avg);
		//7. 학점출력 : 리턴받은 avg를 매개변수로 넣어서 학점을 출력한다.
		String grade = score.getGrade(avg);
		System.out.println("학점 : " + grade);
	}
}
