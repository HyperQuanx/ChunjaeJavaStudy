package test2;


public class MyMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	MyMyClass1<Integer> mys1 = new MyMyClass1<Integer>();
	MyMyClass2<String, Integer> mys2 = new MyMyClass2<String, Integer>();
	
}

class MyMyClass1<T> {
	private T t;
	public T get() {
		return this.t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}


class MyMyClass2<K, V> {
	private K k1;
	private V v1;
	
	public void setKey(K k) {
		this.k1 = k;
	}
	
	public V getValue() {
		return this.v1;
	}
}