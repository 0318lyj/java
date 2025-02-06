package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
		//문제 호출 
		no1();
		no2();
		no3();
	}
	
	static void no1() {
		String ssn1 = "9803061234123";  //7번째값이 
		String ssn2 = "991112 2341234"; //8번째값이 
		String ssn3 = "021112-3341234"; //8번째값이
		StringUtil.checkGender(ssn1);
		StringUtil.checkGender(ssn2);
		StringUtil.checkGender(ssn3);
	}
		
	static void no2() {
		// "파일경로와 파일명"
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringUtil.checkExtesion(file1);
		StringUtil.checkExtesion(file2);
	}
		
	static void no3() {
		//공백 빼고 문자의 갯수를 반환
		String str1 = " suggest ";
		String str2 = " currently ";
		String str3 = " particular ";
		StringUtil.getLength(str1);
		StringUtil.getLength(str2);
		StringUtil.getLength(str3);
	}	
}

