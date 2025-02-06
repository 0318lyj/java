package com.yedam.api;

public class StringUtil {
	static void 연습하기(String str, String str2) {
		//문제연습하는 메소드 ""+""+""
		System.out.println(str.concat(",").concat(str2));
	}
	
	
	static void checkGender(String ssn) {
		// 성별을 출력. "남자입니다" 또는 "여자입니다"
		ssn = ssn.replace(" ","");
		ssn = ssn.replace("-","");
		char chr = ssn.charAt(6);
		switch(chr) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("알수 없는 성별입니다.");
		}
	}
	
	static void checkExtesion(String file) {
		//파일의 확장자는 jpg (또는 mp3, hwp)입니다
	
		int index = file.indexOf(".");
		
	        String extension = file.substring(index + 1);
	        System.out.println("파일의 확장자는 " + extension + "입니다.");
	}
	
	static void getLength(String str) {
		//문자의 길이는 7글자입니다.
		int tel1 = str.trim().length();
		System.out.println(tel1);
	}
} //end of StringUtil
