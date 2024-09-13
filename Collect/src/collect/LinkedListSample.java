package collect;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
	public static void main(String[] args) {
		// 추가 삭제 시에 장점이 있음 빠름 (ArrayList에 비해서)
		List<Integer>linkedList = new LinkedList<Integer>();
		
		// 1. add(E)
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
//		System.out.println(linkedList); // 자동으로 String 형변환이 되어서 아래와 같은 출력이 나오게 됨.
//		System.out.println(linkedList.toString());
		
		// 2. add(index, E)
		linkedList.add(1, 4);
		linkedList.add(2, 6);
//		System.out.println(linkedList);
		
		List<Integer>linkedList2 = new LinkedList<Integer>();
		linkedList2.add(10);
		linkedList2.add(11);
		linkedList2.addAll(linkedList);
//		System.out.println(linkedList2);
		
		
		linkedList2.addAll(4, linkedList);
//		System.out.println(linkedList2);
		
		linkedList.remove(1);
//		System.out.println(linkedList);
		
		
		List<Integer>linkedList3 = new LinkedList<Integer>();
		linkedList3.add(1);
		linkedList3.add(3);
		linkedList3.add(5);
		linkedList3.add(7);
		linkedList3.add(9);
		linkedList3.add(11);
		linkedList3.add(13);
//		linkedList2.removeAll(linkedList3);
//		System.out.println(linkedList2);
		
		

		
	}
}
