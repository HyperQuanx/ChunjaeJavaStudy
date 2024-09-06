package test2;


// import java.util.Scanner;

public class CryAnimal {

	
	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		
//		String b = a.next();
//		
//		System.out.println(b);
		
		
		
		AnimalCry cry = new AnimalCry();
		Bird birdCry = new Bird();
		Cat catCry = new Cat();
		Dog dogCry = new Dog();
		
		
		AnimalList anLiCry = new AnimalList();
		LBird lBirdCry = new LBird();
		LCat lCatCry = new LCat();
		LDog lDogCry = new LDog();
		
		
		cry.cry();
		System.out.println();
		birdCry.cry();
		System.out.println();
		catCry.cry();
		System.out.println();
		dogCry.cry();
		System.out.println("--------------");
		anLiCry.cry();
		System.out.println();
		lBirdCry.cry();
		System.out.println();
		lCatCry.cry();
		System.out.println();
		lDogCry.cry();
		
//		TestT tt = new TestT();
//		System.out.println(tt.equals(tt));
//		System.out.println(tt.toString());
//		System.out.println(tt.getClass());
//		System.out.println(tt.hashCode());
//		System.out.println(tt.notify());
//		System.out.println(tt.notifyAll());
//		System.out.println(tt.wait());
		
		
		// 어지간하면 클래스를 한 곳에 몰아넣지 말고 클래스 파일을 나누자.
		// public 을 한 번밖에 못쓰기 때문에 기본 접근자인 default 로 먹혀서 다른 곳에서 가져오지 못함.
		// 파일 하나 당 클래스 하나
	}

}

