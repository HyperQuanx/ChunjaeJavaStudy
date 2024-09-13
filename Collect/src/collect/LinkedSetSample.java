package collect;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedSetSample {

	public static void main(String[] args) {
//		Set<String> lSet1 = new LinkedHashSet<String>();
		
		// 1. add(E)
//		lSet1.add("가");
//		lSet1.add("나");
//		lSet1.add("다");
//		lSet1.add("가");
//		lSet1.add("나");
//		lSet1.add("다");
//		System.out.println(lSet1);
//		
//		
//		Set<String> lSet2 = new LinkedHashSet<String>();
//		lSet2.add("A");
//		lSet2.add("B");
//		lSet2.add("C");
//		lSet2.add("가");
//		lSet2.add("나");
//		System.out.println(lSet2);
//		
//		lSet2.addAll(lSet1);
//		System.out.println(lSet2);
		
		
		// 3. remove(Object)
//		lSet2.remove("나");
//		System.out.println(lSet2);

		// 이거 안됨.
//		lSet2.remove(lSet2);
//		System.out.println(lSet2);
		
//		lSet2.clear();
//		System.out.println(lSet2);
		
		// 6. contains(Object)
		Set<String> lSet3 = new LinkedHashSet<String>();
		lSet3.add("무궁화 꽃이 피었습니다. 1");
		lSet3.add("무궁화 꽃이 피었습니다. 2");
		lSet3.add("무궁화 꽃이 피었습니다. 3");
		lSet3.add("무궁화 꽃이 피었습니다. 4");
		lSet3.add("무궁화 꽃이 피었습니다. 5");
		System.out.println(lSet3);
		System.out.println(lSet3.contains("무궁화")); // false
		// 만약 찾고 싶다? ArrayList로 변환 후 include 사용.
		// 위의 예시처럼 왔다갔다 많이 함.
		System.out.println(lSet3.contains("무궁화 꽃이 피었습니다. 3")); // true
		
		
		// 7. size()
		System.out.println(lSet3.size());
		
		// 8. iterator()
		Iterator<String> qwer = lSet3.iterator();
		
		while(qwer.hasNext()) {
			System.out.print(qwer.next() + " ");
		}
		System.out.println();
		
		
		// Set --> 배열
		// 9. toArray()
		Object[] obj = lSet3.toArray();
		System.out.println(obj);
		System.out.println(Arrays.toString(obj));
		System.out.println(System.identityHashCode(obj)); // 실제 주소
		
		
		// 10. toArray(T[] t)
		Object[] arrStr1 = lSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(arrStr1));

		
		// 11. toArray(T[] t) 길게 잡기
		Object[] arrStr2 = lSet3.toArray(new String[10]);
		System.out.println(Arrays.toString(arrStr2));
		// 길게 잡으면 나머지 빈 자리에 null 로 채움
		
		
		
		
		
		
		
		
		
		// TreeSet 예제
		
//		Set<Integer> tSet1 = new TreeSet<Integer>();
//		tSet1.add(1);
//		tSet1.add(2);
//		tSet1.add(3);
//		tSet1.add(5);
//		tSet1.add(4);
//		tSet1.add(12);
//		tSet1.add(32);
//		tSet1.add(17);
//		
//		System.out.println(tSet1);
		
		
		// TreeSet은 무조건 오름차순
//		Set<String> tSet2 = new TreeSet<String>();
//		tSet2.add("가");
//		tSet2.add("다");
//		tSet2.add("나");
//		tSet2.add("라");
//		tSet2.add("마");
//		tSet2.add("E");
//		tSet2.add("D");
//		tSet2.add("C");
//		tSet2.add("B");
//		tSet2.add("A");
//		
//		System.out.println(tSet2);
		
		
		
	}

}
