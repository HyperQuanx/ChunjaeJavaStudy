package chap12;

public class MyClass<T> {
	private T t;
	public T get() {
		return this.t;
	}
	public void set(T t) {
		this.t = t;
	}
}
