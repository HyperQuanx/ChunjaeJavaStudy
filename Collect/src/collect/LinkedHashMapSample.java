package collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedHashMapSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
		
		// 1. put(K, V)
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");
		
		System.out.println(lhMap1);

		
		// 2. putAll(Map<? extends K, ? extends V> m)
		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2);
		
		
		// 3. replace(K, V)
		lhMap2.replace(1, "가가가");
		lhMap2.replace(4, "라라라");
		
		System.out.println(lhMap2);
		
		
		// 4. replace(K, V old, V new)
		lhMap2.replace(1, "가가가", "나나나");
		lhMap2.replace(2, "가가가", "다다다");
		
		System.out.println(lhMap2);
		
		
//		// 내가 한거
//		Map<Integer, String> lhMap3 = new LinkedHashMap<Integer, String>();
//		
//		for(int i = 1; i <= lhMap2.keySet().size(); i++) {
//			lhMap3.put(i, lhMap2.get(i));
//		}
//		System.out.println("asd");
//		System.out.println(lhMap3);
		
		
		
		// 미경님이 하신거
//		Map<Integer, String> lhMap4 = new LinkedHashMap<Integer, String>(lhMap2);
//		TreeSet<Integer> keys = new TreeSet<Integer>(lhMap4.keySet());
//		
//		for(Integer i : keys) {
//			lhMap4.put(i, lhMap4.remove(i));
//		}
//		System.out.println("lhMap4 : " + lhMap4);
		
		// -----------------------------------------------------------------------------------------------------------------
		System.out.println("원본 데이터");
		System.out.println(lhMap2);
		
		Map<Integer, String> lhMap3 = new LinkedHashMap<Integer, String>();
		lhMap2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e->lhMap3.put(e.getKey(), e.getValue()));
		System.out.println("람다식으로 한줄 만들기");
		System.out.println(lhMap3);
		// -----------------------------------------------------------------------------------------------------------------
	}

}
