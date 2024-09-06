package chap11;

public class ExecInterface implements D {
	
	ExecInterface() {
		
	}
	
	@Override
	public String getConnection(String ip, int port) {
		System.out.println(ip);
		return "CONN";
	}
	
	@Override
	public void print() {
		System.out.println(false);
	}
	
	public void test() {
		System.out.print("추가메서드");
	}
}
