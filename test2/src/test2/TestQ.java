package test2;

public class TestQ {

	public static void main(String[] args) {
		String str1 = "ㅎㅇ";
		String str2 = "ㅎㅇㅎㅇ";
		String str3 = "ㅎㅇ";
//		int a;
//		int b = c;
		Integer c = null;
		var d = "ㅂㅈㄷㅂㅈㄷ";
		Integer e = 123;
		
		String strSum = str1.concat(str2);
		
		
		// 장문일 때 어지간해선 빌더를 사용, 메모리 이슈를 줄여줌
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3)); // string 은 = 쓰지 말고 equal 을 사용
		System.out.println(strSum);
		System.out.println(sb);
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
//		System.out.println(c.getClass()); 에러 생김
		System.out.println(d);		
		System.out.println(d.getClass());
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println(e);
		System.out.println(e.getClass());
		//기초 자료형은 null 을 할당할 수 없고 참조 자료형은 null 을 할당할 수 있다.
		
		
		
//		int add(int x, int y) {
//		    return x + y;
//		}
//
//		// 위의 메서드를 람다 표현식을 이용해 아래와 같이 단축 시킬수 있다. (메서드 반환 타입, 메서드 이름 생략)
//		(int x, int y) -> {
//			return x + y;
//		};
//
//		// 매개변수 타입도 생략 할 수 있다.
//		(x, y) -> {
//			return x + y;
//		};
//
//		// 함수에 리턴문 한줄만 있을 경우 더욱 더 단축 시킬 수 있다. (중괄호, return 생략)
//		(x, y) -> x + y;
	}

}




