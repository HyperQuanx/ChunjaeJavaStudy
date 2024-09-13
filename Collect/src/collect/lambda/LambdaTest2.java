package collect.lambda;

interface A{
	void method1();
}
interface B{
	void method2(int a);
}
interface C{
	int method3();
}
interface D{
	double method4(int a, double b);
}

public class LambdaTest2 {

	public static void main(String[] args) {
		// 1. 익명 이너클래스 방식으로 구현
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력 매개변수 X, 리턴 값 X 함수");
			}
		};
		a1.method1();
		
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력 매개변수 O, 리턴 값 X 함수");
			}
		};
		b1.method2(1);
		
		C c1 = new C() {
			@Override
			public int method3() {
				System.out.println("입력 매개변수 X, 리턴 값 O 함수");
				return 3;
			}
		};
		c1.method3();
		
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {
				System.out.println("입력 매개변수 O, 리턴 값 O 함수 : " + a + ", " + b);
				return a + b;
			}
		};
		d1.method4(4, 4.0);
		
		
		System.out.println("===================================================");
		// 2. 람다식
		A a2 = () -> {System.out.println("입력 매개변수 X, 리턴 값 X 함수");};
		a2.method1();
		
		B b2 = (int a) -> {System.out.println("입력 매개변수 O, 리턴 값 X 함수");};
		b2.method2(2);
		
		C c2 = () -> {return 3;};
		c2.method3();
		
		D d2 = (int a, double b) -> {return a + b;};
		d2.method4(4, 4.4);
		
//		// 이렇게도 활용 가능
//		D d3 = (a, b) -> {return a + b;};
//		D d4 = (a, b) -> a + b;
		
	}
}
