package chap12;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 명시하지 않으면 자동 형변환됨
//		MyClass my1 = new MyClass();
//		my1.set(123);
//		System.out.println(my1.get());
		
		// 요래 명시해줘야됨.
//		MyClass<String> my1 = new MyClass<String>();
//		my1.set("qwer");
//		System.out.println(my1.get());
		
		// practice
//		MyClass<Integer> my2 = new MyClass<Integer>();
//		my2.set(1234);
//		System.out.println(my2.get());
		
		// ? 왜 안되징 d를 안붙여서
//		MyClass<Double> my3 = new MyClass<Double>();
//		my2.set(1234.123);
//		System.out.println(my2.get());
		
		
//		MyClass<Integer> my4 = new MyClass<>(); // 강한 타입 체크
//		
//		Generic2<String, Integer> fruits = new Generic2<String, Integer>();
//		fruits.setKey("사과");
//		fruits.setValue(10000);
//		String key1 = fruits.getKey();
//		int val1 = fruits.getValue();
//		
//		System.out.println("key1 : " + key1 + ", val1 : " + val1);
//		
//		
//		Generic2<Integer, String> g2 = new Generic2<Integer, String>();
//		g2.setKey(404);
//		g2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
//		int key2 = g2.getKey();
//		String val2 = g2.getValue();
//		
//		System.out.println("key2 : " + key2 + ", val2 : " + val2);
//		
//		
//		Generic2<String, Void> g3 = new Generic2<String, Void>();
//		g3.setKey("키 값만 사用");
//		String key3 = g3.getKey();
//		
//		System.out.println("key3 : " + key3);
		
//		Goods<Apple> gd1 = new Goods<Apple>();
//		gd1.set(new Apple());
//		Apple apple = gd1.get();
//		
//		Goods<Pencil> gd2 = new Goods<Pencil>();
//		gd2.set(new Pencil());
//		Pencil pencil = gd2.get();
		
		Goods2<Apple> goods = new Goods2<>();
//		Goods2<Pencil> goods2 = new Goods2<Pencil>(); // 안됨.
		
	}

}

