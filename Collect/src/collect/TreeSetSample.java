package collect;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSample {
	public static void main(String[] args) {
		
//		Set<String> tSet1 = new TreeSet<String>();
//		tSet1.add("가");
//		tSet1.add("나");
//		tSet1.add("가");
//		tSet1.add("다");
//		tSet1.add("가");
//		tSet1.add("나");
		
		
//		List<String> arrList = new ArrayList<String>();
//		arrList.add("가");
//		arrList.add("나");
//		arrList.add("가");
//		arrList.add("다");
//		arrList.add("가");
//		arrList.add("나");
//		
//		tSet1.addAll(arrList);
//		System.out.println(arrList);
//		System.out.println(tSet1);
//		
//		arrList.clear();
//		arrList.addAll(tSet1);
//		System.out.println(arrList);
		
		
		
		TreeSet<Integer> tSet1 = new TreeSet<Integer>();
		for(int i = 0; i < 50; i++) {
			tSet1.add(i);
		}
		
		
//		// 1. first()
//		System.out.println(tSet1.first());
//		
//		// 2. last()
//		System.out.println(tSet1.last());
//		
//		// 3. lower()
//		System.out.println(tSet1.lower(25));
//		
//		// 4. higher()
//		System.out.println(tSet1.higher(25));
//		
//		// 5. floor()
//		System.out.println(tSet1.floor(25));
//		
//		// 6. ceiling()
//		System.out.println(tSet1.ceiling(25));
//		
//		
//		
////		System.out.print("tSet1 : " + tSet1 + " ");
//	
//		// 데이터를 꺼내는 방법
//		// 8. pollFirst()
//		System.out.println("tSet1.size() : " + tSet1.size());
//		System.out.println("tSet1 : " + tSet1);
//		for(; ;) {
//			if (tSet1.size() <=0) break;
//			System.out.print(tSet1.pollFirst() + " ");
//		}
//		System.out.println();
//		System.out.println("tSet1.pollFirst() : " + tSet1.pollFirst());
//		System.out.println("tSet1 : " + tSet1);
//		System.out.println();
//		System.out.println("tSet1.size() : " + tSet1.size());
//		System.out.println("tSet1.pollFirst() : " + tSet1.pollFirst());
//		System.out.println("tSet1.size() : " + tSet1.size());
//		
//		
//		for(int j = 0; j <= 100; j++) {
//			System.out.print("-");
//			if (j == 100) {
//				System.out.println();				
//			}
//		}
//		
//		
//		
//		// 9. pollLast()
//		TreeSet<Integer> tSet2 = new TreeSet<Integer>();
//		System.out.println("tSet2.size() : " + tSet2.size());
//		System.out.println("tSet2 : " + tSet2);
//		for(; ;) {
//			if (tSet2.size() <=0) break;
//			System.out.print(tSet2.pollLast() + " ");
//		}
//		System.out.println();
//		System.out.println("tSet2.size() : " + tSet2.size());
//		System.out.println("tSet2 : " + tSet2);
//		System.out.println("tSet2.pollFirst() : " + tSet2.pollLast());
//		System.out.println("tSet2 : " + tSet2);
		
		
//		// 데이터 부분집합(SubSet) 생성
//		// SortedSet<E> headSet(E to)
//		TreeSet<Integer> tSet3 = new TreeSet<Integer>();
//		for(int i = 50; i > 0; i-=2) {
//			tSet3.add(i);
//		}
//		System.out.println(tSet3);
//		
//		SortedSet<Integer> sSet = tSet3.headSet(50, true);
//		System.out.println(sSet);
		
		
		
//		TreeSet<String> tSet4 = new TreeSet<String>();
		
		// 이런 것도 가능
//		for(char i ='A'; i <= 'Z'; i++) {
//			tSet4.add(String.valueOf(i));
//		}
//		for(char i ='A'; i <= 'Z'; i++) {
//			tSet4.add(String.valueOf(i) + String.valueOf(i) + String.valueOf(i));
//			if (i == 'G') {
//				tSet4.add(String.valueOf(i) + "라라");
//			} else if (i == 'J') {
//				tSet4.add(String.valueOf(i) + "마마마");
//			}
//		}
//		System.out.println(tSet4);
//		SortedSet<String> tSet5 = tSet4.headSet("J헿");
//		System.out.println(tSet5);

		TreeSet<MyClass> mySet1 = new TreeSet<MyClass>();
		MyClass my1 = new MyClass(2, 4);
		MyClass my2 = new MyClass(3, 3);
		mySet1.add(my1);
		mySet1.add(my2);
		System.out.println(mySet1);
	}
}


class MyClass{
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}
class MyCompClass implements Comparable<MyCompClass>{
	int data1;
	int data2;
	public MyCompClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyCompClass o) {
		if(data1 < o.data1){
		return -1;
		}
		else if(data1 ==  o.data1) {
			return 0;
		}
		else {
			return 1;
		}
	}
}


