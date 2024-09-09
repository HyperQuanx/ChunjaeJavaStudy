package chap14;

public class AClose implements AutoCloseable {
	String rsc;
	AClose() {
		
	}
	AClose(String rsc) {
		this.rsc = rsc;
	}
	void abc() throws Exception {
		
	}
	
	@Override
	public void close() throws Exception {
		if(rsc != null) {
			try {
				//
			} catch(Exception e) {
				// 예외처리
			}
		}
	}
}
