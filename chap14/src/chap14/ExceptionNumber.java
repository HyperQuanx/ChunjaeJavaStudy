package chap14;

public class ExceptionNumber {
	// 1 ~ 100 까지만 유효 / 이외의 점수는 예외를 발생시키는 사용자 정의 예외 클래스를 작성
	// 음수 처리 : MinusException
	// 100 초과 처리 : OverException
	
	public void exNum(int num) {
		try {
			if (num >= 1 && num <= 100) {
				System.out.println("정상");
			} else if (num < 0){
				throw new MinusException("MinusException");
			} else {
				throw new OverException("OverException");
			}
		} catch(MinusException e) {
			System.out.println("음수임 : " + e.getMessage());
		} catch (OverException e) {
			System.out.println("초과함 : " + e.getMessage());
		}
		
	}
	
	public void numNum(int w) {
		exNum(w);
	}
}

class MyMyClass<T> {
	private T t;
	public T get() {
		return this.t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
