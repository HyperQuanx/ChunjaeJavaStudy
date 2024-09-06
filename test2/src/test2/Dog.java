package test2;

public class Dog extends AnimalCry {
	Dog() {
		super();
	}
	
	String cry = "멍멍";
	
	@Override
	public void cry() {
		System.out.println(cry);
	}
}

