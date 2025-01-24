package com.yedam.reference;
/*
  도서명, 저자, 출판사, 판매가격 
 */
import java.util.Scanner;

public class BookExe3 {
	

	
	static Book3[] bookRepository = new Book3[100];
//	public static void init() {
//		//초기데이터 
//		bookRepository[0] = new Book3("이것이 자바다", "신용권", "한빛미디어", 30000);
//		bookRepository[1] = new Book3("자바스크립트기초", "김기초", "한빛미디어", 20000);
//		bookRepository[2] = new Book3("혼자공부하는 자바", "김자바", "자바출판사", 25000);
//	} //init 끝
	
	//목록출력
	public static void printList() {
		System.out.println("도서명        저자            가격");
		System.out.println("===============================");
		for (int i =0; i < bookRepository.length;i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("===============================");
	} //printList() 끝
	
	
	static Scanner scn = new Scanner(System.in);
	
	public static void addBook() {
		System.out.println("도서명 입력>>>");
		String name = scn.nextLine();
		System.out.println("저자를 입력>>>");
		String author = scn.nextLine();
		System.out.println("출판사 입력>>>");
		String press = scn.nextLine();
		System.out.println("가격 입력>>>");
		int price = Integer.parseInt(scn.nextLine());
		
		for(int i = 0; i < bookRepository.length; i++) {
			if(bookRepository[i] == null) {
				bookRepository[i] = new Book3(name,author,press,price);
				System.out.println("등록완료");
				break; //for문 종료.
			}
		}
	} // addBook() 끝
	
	// 목록(출판사)
	public static void searchList() {
		System.out.println("출판사 입력>>>");
		String press = scn.nextLine();
		
		System.out.println("도서명          저자           가격");
		System.out.println("===============================");
		for (int i =0; i < bookRepository.length;i++) {
			if (bookRepository[i] != null && 
					bookRepository[i].getBookPress().equals(press)) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("===============================");
	} //searchList 끝
	
	//가격수정
	public static void modifyBook() {
		System.out.println("도서명 입력>>>");
		String name = scn.nextLine();
		System.out.println("가격 입력>>>");
		int price = Integer.parseInt(scn.nextLine());
		//도서명으로 검색 => 입력값으로 필드변경 
		boolean isExist = false; //
		for (int i = 0; i < bookRepository.length; i++) {
			if(bookRepository[i]!=null &&
					bookRepository[i].getBookTitle().equals(name)) {
				bookRepository[i].setBookPrice(price);
				System.out.println("수정완료.");
				isExist = true;
				break; // 수정완료되면 반복문 종료
			}
		}// end of for
		if(!isExist) {
			System.out.println("찾는 도서가 없습니다.");
		}
	}
	
	//상세조회
	public static void showDetail() {
		System.out.print("도서명 입력>>");
		String name= scn.nextLine();
		Calculator cal = new Calculator();
		cal.getBookInfo(name, bookRepository).showDetailInfo();
		
	}
	public static void main(String[] args) {
		init(); //기초데이터 생성
		
		
		
		
		Book3[] bookRepository = new Book3[100];
		
		
		boolean run = true;
		Scanner scn =new Scanner(System.in);
		
		//1.전체목록 2.도서등록
		while(run) {
//			int Num1 = scn.nextInt()
			System.out.println("1. 전체목록 2.도서등록 3.조회(출판사) 4.금액수정 9.종료");
			System.out.println("메뉴를 선택하세요>>");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //목록출력. 도서명, 저자 가격
				printList();
				break;
				
			case 2: //입력 //등록하기
				addBook();
				break; 
				//switch case문 종료
				
			case 3: //조회(출판사)
				searchList();
				break;
			
			case 4: // 수정.
				modifyBook();
				break;
			case 5://상세조회
				showDetail();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			default:
				System.out.println("메뉴를 다시 선택하세요");
				
			}
		}
		//1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		
	}//메인 끝
}
