package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;

import comyedam.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map 
 */

public class Exe {
	public static void main(String[] args) {
		//학생정보를 저장하는 컬렉션(ArrayList) 선언
		//3명추가
		List<Student> students = new ArrayList<Student>(); //컬렉션
		students.add(new Student("홍길동", 80, 83));
		students.add(new Student("김민수", 84, 87));
		students.add(new Student("박성용", 79, 91));
		
		
		//출력
			for (int i = 0; i < students.size(); i++) {
				System.out.println("이름: " + students.get(i).getStudentName());
			}
		}
		
		//삭제
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getStudnetName().equals("김민수")) {
				//students[i]
				studetns.remove(i);
				break;
			}
		}
		
	void method() {
		String[] strAry = new String[10]; //배열. 
		List<String> strList = new ArrayList<String>(); // 컬렉션. 
		List<Friend> friends = new ArrayList<Friend>(); // 컬렉션.
		
		
		friends.add(new Friend("홍길동", "010-111"));
		friends.add(new ComFriend("김길동", "010-2222", "국민은행", "신용카드"));
		
		friends.remove(new Friend("홍길동", "010-111"));
		System.out.println("friends크기: " + friends.size());
		
		System.out.println(friends.get(1).getFriendName());
		
		
		//추가 
		strList.add("안녕하세요");
		strList.add("Hello!");
		strList.add("반갑습니다.");
		System.out.println("strList크기: " + strList.size());
		
		//삭제. 
		strList.remove(0);
		strList.remove("Hello");
		System.out.println("strList크기: " + strList.size());
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
