package test;

public class test {
	int a;
	int b;
	String c;
	String d;

	public String getC() {
		return c;
	}

// 내부에 main 함수 생성
	public static void main(String[] args) {
		test testGen = new test();
		testGen.c = "ccc";

		System.out.println(testGen.c);
		System.out.println(testGen.getC());
	}
}