package com.yedam.reference;
//gender => MEN, WOMEN 
public class Student {
	//필드(속성): 학생이름,영어점수,수학점수를 담기위한 클래스
		String studentName;
		int engScore;
		int mathScore;
		Gender gender; //남 ,여, 남자, M
		
		//생성자: 필드의 초기값을 지정해서 인스턴스 생성
		Student() { //기본생성자: 매개값이 없는 생성자
		}
		
		Student(String StudentName, int engScore) {
			this.studentName = StudentName;
			this.engScore = engScore;
		}
		
		Student(String StudentName, int engScore, int mathScore) {
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

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getEngScore() {
			return engScore;
		}

		public void setEngScore(int engScore) {
			if (engScore < 0) {
				this.engScore = 0;
			} else {
				this.engScore = engScore;
			}
		}

		public int getMathScore() {
			return mathScore;
		}

		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}
		
		
}
