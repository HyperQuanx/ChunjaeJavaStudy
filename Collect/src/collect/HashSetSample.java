package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetSample {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<String>();
		
		// 1. add(E)
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		hSet1.add("라");
		hSet1.add("마");
		hSet1.add("바");
		hSet1.add("사");
		hSet1.add("아");
		hSet1.add("자");
		hSet1.add("차");
		hSet1.add("카");
		hSet1.add("타");
		hSet1.add("파");
		hSet1.add("하");
		System.out.println(hSet1);
		
		
		// 2. addAll(Collection <? extends E> c)
		Set<String> hSet2 = new HashSet<String>();
		hSet2.add("A");
		hSet2.add("B");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		
		// 3. remove(Object o)
		hSet1.remove("나");
		System.out.println(hSet1);
		
		
		// 4. clear
		hSet2.clear();
		System.out.println(hSet2);
		System.out.println(hSet2.isEmpty());
		
		
		// 똑같은거 넣어도 하나만 나옴
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("가");
		hSet3.add("가");
		hSet3.add("가");
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("나");
		hSet3.add("나");
		hSet3.add("다");
		hSet3.add("다");
		hSet3.add("다");
		System.out.println(hSet3);
		
		// 값을 포함하는지 찾기
		System.out.println(hSet3.contains("가"));
		System.out.println(hSet3.contains("라"));
		
		// 사이즈
		System.out.println(hSet3.size());
		
		// iterator()
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
		
		// toArray
		Object[] obj = hSet3.toArray();
		System.out.println(Arrays.toString(obj));
		
		// toArray(T[] t)
		String[] arrStr = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(arrStr));
		
		// toArray(T[] t)
		String[] arrStr2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(arrStr2));
		
		
		List<String> test = new ArrayList<String>();
		test.addAll(hSet3);
		System.out.println(test);
		
		
		Set<String> tSet = new HashSet<String>();
		tSet.addAll(hSet3);
		hSet3.clear();
		hSet3.addAll(tSet);
		System.out.println(tSet);
		
	}

}
