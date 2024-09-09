package chap14;

// Runtime 시 발생하는 에러를 받는 클래스
public class MyRClass extends RuntimeException {
	MyRClass() {}
	MyRClass(String s) {
		super(s);
	}
	
}
