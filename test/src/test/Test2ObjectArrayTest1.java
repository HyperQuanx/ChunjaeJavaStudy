package test;

public class Test2ObjectArrayTest1 {
	private String bookName;
	private String author;
	
	public Test2ObjectArrayTest1() {} // 기본 생성자
	
	public Test2ObjectArrayTest1(String bookName, String author) {
		this.bookName = bookName; // 책 이름을 매개변수로 받는 생성자
		this.author = author; // 저자 이름을 매개변수로 받는 생성자
	}
	
	public String getBookName() {
		return bookName; // getter
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author; // getter
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	} // 책 정보를 출력해 주는 메서드
}
