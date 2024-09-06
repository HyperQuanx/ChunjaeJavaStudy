package chap11;

public class SampleClass {	
	public static void main(String[] args) {
//		InnerClass aa = new InnerClass();
//		InnerClass.B bb = aa.new B();
//		
//
//		bb.abc();
//		
		
		
		E e = new E() {
			@Override
			public void abc() {
				test1();
				test2();
				test3();
			}
			public void test1() {System.out.println("test1");}
			public void test2() {System.out.println("test2");}
			public void test3() {System.out.println("test3");}
		};
		
		e.abc();
		
//		E f = new F();
//		E ff = new F();
//		E fff = new F();
		// 익명 내부 클래스는 내부에서만 접근 가능함
	}

	
		
}



// 로컬변수에서 값을 할당 안하면 에러
// 참조 자료형의 프로퍼티는 기초 자료형 일 때 기본값으로 초기화 된다.