package chap11;

public class InnerClass { // ==> 아우터클래스

	// 아우터클래스의 프로퍼티
	public int a = 1;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	
	// 아우터클래스의 메소드
	public void ma() {
		
	}
	
	protected void mb() {
		
	}
	
	void mc() {
		
	}
	
	private void md () {
		
	}
	
	// 이너클래스
	class B {
		public int a = 0;
		// 이너클래스의 메소드
		void abc() {
			System.out.println("this a : " + this.a);
			System.out.println("Outer a : " + InnerClass.this.a);
			System.out.println("Outer b : " + b);
			System.out.println("Outer c : " + c);
			System.out.println("Outer d : " + d);
			
			ma();
			mb();
			mc();
			md();
		}
	}
}


// 이너클래스는 내부 요소에 모두 접근할 수 있다