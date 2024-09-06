package test2;

public class AnimalList {
	public void cry() {
		System.out.println("어흥");
	}
}

class LBird extends AnimalList {
	public void cry() {
		System.out.println("짹짹");
	}
}

class LCat extends AnimalList {
	public void cry() {
		System.out.println("야옹");
	}
}

class LDog extends AnimalList {
	public void cry() {
		System.out.println("멍멍");
	}
}