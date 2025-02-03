



public class Book2 {
	// 필드
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;
	
	
	//생성자
	Book2(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}
	//제목, 저자, 가격
	String showBookInfo() {
		return bookTitle + "   " + bookAuthor + "   " + bookPrice;
	}
	// setter. 
	void setBookPrice(int bookPrice) {
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
