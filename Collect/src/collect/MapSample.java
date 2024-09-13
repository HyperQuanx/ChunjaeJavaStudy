package collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {

	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		
		
		// 1. put(K, V)
		hMap1.put(2,  "가나다");
		hMap1.put(1,  "나다라");
		hMap1.put(3,  "다라마");
		
		System.out.println(hMap1);
		
		
		// 2. putAll(<Map<? extends K, ? extends V> m)
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		
		hMap2.putAll(hMap1);
		
		System.out.println(hMap2);
		
		
		// 3. replace(K, V)
		String s1 = hMap2.replace(1,  "가가가");
		String s2 = hMap2.replace(4,  "라라라");
		
		System.out.println(s1);
		System.out.println(s2); // key 가 없어서 null
		System.out.println(hMap2);
		
		
		// 4. replace(K, V old, V new);  // 출력 값 boolean
		boolean b1 = hMap2.replace(1,  "가가가", "나나나");
		boolean b2 = hMap2.replace(2,  "다다다", "라라라");
		
		System.out.println(b1);
		System.out.println(b2); // 원 값이 같아야 true 가 출력되고 값이 바뀜
		System.out.println(hMap2);
		
		
		// 5. V get(Object key)
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		
		// 6. containsKey(Object k)  // 게시판 출력, 게시판 입력 등을 이걸로 함  // 로그인한 유저인지 아닌지 따질 때도 사용.
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		
		
		// 7. containsValue(Object v)
		System.out.println(hMap2.containsValue("나나나"));
		System.out.println(hMap2.containsValue("다다다"));
		
		
		// 8. Set<K> keySet()
		Set<Integer> keySetList = hMap2.keySet();
		
		System.out.println(keySetList.toString());
		

		// 9. Set<Map.Entry<K, V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		
		System.out.println(entrySet.toString());
		
		
		// 10. size()
		System.out.println(hMap2.size());
		
		
		// 11. remove(Object K)
		System.out.println(hMap2.remove(3));
		System.out.println(hMap2);
		
		hMap2.put(3,  "다라마");
		
		System.out.println(hMap2);
		
		
//		for (Map.Entry<Integer, String> entry : hMap1.entrySet()) {
//		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//		}
		
		
		// 12. remove(Object K, object V)
		hMap2.remove(1, "나나나");
		hMap2.remove(3, "다다다");
		
		System.out.println(hMap2);
		
		
		// 13. clear()
		hMap2.clear();
		
		System.out.println(hMap2);
	}

}
