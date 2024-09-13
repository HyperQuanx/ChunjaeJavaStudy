package collect;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestMain extends Object {

	public static void main(String[] args) {
//		H h = new H();
//		System.out.println(h);
		
//		A a1 = new A(3);
//		A a2 = new A(3);

		

//		
//		
//		String s1 = "abc";
//		String s2 = "abc";
//		String ns1 = new String("abc");
//		String ns2 = new String("abc");
//		
//		
//		Set<A> hSet1 = new HashSet<A>();

//		System.out.println(a1 == a2);
//		System.out.println(a1.equals(a2));
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(ns1 == ns2);
//		System.out.println(ns1.equals(ns2));
		
		
		/*
		 * 참조 자료형
		 * 
		 * 
		 * 
		 * 
		 */
		Integer i1 = 3;
		Integer i2 = 3;
		Integer j1 = 128;
		Integer j2 = 128;
		
		System.out.println("i1 == i2 : " + (i1 == i2));
		System.out.println("i1.equals(i2) : " + i1.equals(i2));
		System.out.println("j1 == j2 : " + (j1 == j2));
		System.out.println("j1.equals(j2) : " + j1.equals(j2));

        System.out.println("i1의 hashCode: " + System.identityHashCode(i1));
        System.out.println("i2의 hashCode: " + System.identityHashCode(i2));
        System.out.println("j1의 hashCode: " + System.identityHashCode(j1));
        System.out.println("j2의 hashCode: " + System.identityHashCode(j2));
        
        
// ------------------------------------------------------------------------------------------
        
        
		String s1 = "abc";
		String s2 = "abc";
		String ns1 = new String("abc");
		String ns2 = new String("abc");
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("ns1 == ns2 : " + (ns1 == ns2));
		System.out.println("ns1.equals(ns2) : " + ns1.equals(ns2));

        System.out.println("s1의 hashCode: " + System.identityHashCode(s1));
        System.out.println("s2의 hashCode: " + System.identityHashCode(s2));
        System.out.println("ns1의 hashCode: " + System.identityHashCode(ns1));
        System.out.println("ns2의 hashCode: " + System.identityHashCode(ns2));
		

        
//		Set<A> hSet1 = new HashSet<A>();
//		A a1 = new A(3);
//		A a2 = new A(3);
//		hSet1.add(a1);
//		hSet1.add(a2);
//		
//		System.out.println("a1 == a2 : " + (a1 == a2));
//		System.out.println("a1.equals(a2) : " + (a1.equals(a2)));
//		System.out.println(a1.hashCode() + " : " + a2.hashCode());
//		System.out.println(hSet1.size());
		
		
		
//		Set<B> hSet2 = new HashSet<B>();
//		
//		B b1 = new B(3);
//		B b2 = new B(3);
//		hSet2.add(b1);
//		hSet2.add(b2);
//		
//		System.out.println("b1 == b2 : " + (b1 == b2));
//		System.out.println("b1.equals(a2) : " + (b1.equals(b2)));
//		System.out.println(b1.hashCode() + " : " + b2.hashCode());
//		System.out.println(hSet2.size());
	
		
		
	}

}

class H{}

class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}


class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if (this.data == ((B)obj).data) {
				return true;
			}
		}
		return false;
	}
	
}