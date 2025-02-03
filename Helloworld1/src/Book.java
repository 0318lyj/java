public class Book {
	// 필드
	String bookTitle;
	String bookAuthor;
	String bookPress;
	int bookPrice;
	
	
	//생성자
	Book(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}
	
	//제목, 저자, 가격
	String showBookInfo() {
		return bookTitle + "   " + bookAuthor + "   " + bookPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
	
}
