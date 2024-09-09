package chap12;

public class Main {

	public static void main(String[] args) {
//		C cc = new C();
//		A a1 = new B();
//		cc.bcd(a1);
//		cc.bcd(new B());
//		
//		// 익명 이너클래스 이용
//		A a2 = new A() {
//			public void abc() {
//				System.out.println("a2 --> abc()");
//			}
//		};
//		cc.bcd(a2);
//		
//		// 익명 이너클래스 이용2
//		cc.bcd(new A() {
//			public void abc() {
//				System.out.println("익명 이너클래스 이용2");
//			}
//		});
		
//익명 이너 인터페이스 사용
//		G gg = new G();
//		gg.abc();
//		
//		new E.F() {
//			
//			@Override
//			public void abc() {
//				System.out.println("E.F b -> abc()");
//			}
//		}.abc(); // 선언과 동시에 실행
//		bb.abc();
		
		
		// 일반적인 UI API 구조 예 (버튼)
		Button btn1 = new Button();
		btn1.setOnClicklistener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("버튼1 클릭 >> 음악 재생");
			}
		});
		
		btn1.onClick();
		
		
		Button btn2 = new Button();
		btn2.setOnClicklistener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("버튼2 클릭 >> 음악 종료");
			}
		});
		
		btn2.onClick();
	}

}
