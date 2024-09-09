package chap14;

public class B {
	void abc() {
//		bcd();
// 		가급적 함수 안에서 예외처리 해야함.
		try {
			bcd();
		} catch (Exception e) {
			// 예외처리
		}
	}
	
	void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}
