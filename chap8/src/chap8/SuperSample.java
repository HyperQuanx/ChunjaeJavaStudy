package chap8;

public class SuperSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Human 객체
//		Human h = new Human();
//		h.age = 20;
//		// 위 아래 같음
//		h.setAge(20);
//		h.name = "홍길동"; // h.setName("홍길동"); 과 같다. setter 를 만들어서 우측처럼 사용하는게 기본.
//		h.eat();
//		h.sleep();
//		
//		System.out.println();
//		
//		Student s = new Student();
//		s.setName("홍길순");
//		s.setAge(21);
//		s.eat();
//		s.sleep();
//		s.goToSchool();
		
		Human hh1 = new Human();
		Human hh2 = new Student();
		Human hh3 = new Job();
		
		Student ss1 = new Student();
//		Student ss2 = (Student) new Human(); // 자식
//		Student ss3 = new Job(); // 형제
		Student ss2 = null;
		
		if (ss2 instanceof Student) {
			ss2 = (Student) new Human();
		}
		
	}

}
