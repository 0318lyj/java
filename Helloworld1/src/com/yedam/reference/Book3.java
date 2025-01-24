package com.yedam.reference;

public class Book3 {
	// 필드
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;
	
	
	//public, default, private => 접근지시자(access)
	//생성자 
	Book3(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}
	
	//제목, 저자, 가격
	public String showBookInfo() {
		return bookTitle + "   " + bookAuthor + "   " + bookPrice;
	}
	
	public void showDetailInfo() {
		//도서명:이것이 자바다      출판사: 한빛미디어
		//저자:신용권  			가격: 25000원
		String strFormat = "도서명: %10s\t 출판사: %6s\n 저자: %3s\t\t 가격: %5d 원 \n";
		System.out.printf(strFormat, bookTitle, bookPress, bookAuthor, bookPrice);
	}
	
	// setter. 
	public void setBookPrice(int bookPrice) {
		if (bookPrice < 0) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookPrice; 
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPress = bookPrice;
	}
	
	//getter
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public String getBookPress() {
		return bookPress;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	
	
	
	
}
