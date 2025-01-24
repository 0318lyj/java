package com.yedam.reference;

public class Student2 {
	//필드(속성): 학생이름,영어점수,수학점수를 담기위한 클래스
		String studentName;
		int engScore;
		int mathScore;
		//생성자: 필드의 초기값을 지정해서 인스턴스 생성
		
		Student2() { //기본생성자: 매개값이 없는 생성자
		}
		
		Student2(String StudentName, int engScore) {
			this.studentName = StudentName;
			this.engScore = engScore;
		}
		
		Student2(String StudentName, int engScore, int mathScore) {
			this.mathScore = mathScore;
			this.engScore = engScore;
			this.studentName = StudentName;
		}
		
		//메소드(기능)
		void printInfo() {
			System.out.printf("이름은 %s, 영어점수는 %d, 수학점수 %d\n", studentName, engScore, mathScore );
		}
		
		//기능추가: 평균을 반환
		double getAverage() {
			return(engScore + engScore) / 2.0; //(88 + 89) / 2
		}
}
