package chap12;


public class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
}
