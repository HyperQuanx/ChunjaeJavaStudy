package test2;

public class Cat extends AnimalCry {
	Cat() {
		super();
	}
	
	String cry = "야옹야옹";
	
	@Override
	public void cry() {
		System.out.println(cry);
	}
}

