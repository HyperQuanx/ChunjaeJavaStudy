package chap11;

public interface C {
	public static final int a = 1;
	
	public static final String ip = "192.168.1.254";
	
	public static final int port = 3306;
	
	public abstract String getConnection(String ip, int port);
	
	default void print() {
		System.out.println("PRINT");
	}
	
	
	// or
	
	// body 로 구현하고 싶다면
//	default void ccc () {
//	
//	}
	
	// abstract 가 빠지면 컴파일러가 자동으로 넣어줌 근데 무적권 명시
	// final 이든 static 이든 하나만 명시하면 자동으로 static final 이 됨
}
