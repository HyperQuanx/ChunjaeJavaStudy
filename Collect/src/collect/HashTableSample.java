package collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTableSample {

	public static void main(String[] args) {
		// 순서 보장 안함
		// 1. put(K, V)
		Map<Integer, String> hTable1 = new Hashtable<Integer, String>();
		
		hTable1.put(2,  "나다라");
		hTable1.put(1,  "가나다");
		hTable1.put(3,  "다라마");
		hTable1.put(4,  "바라사");
		hTable1.put(5,  "다바아");
		
		System.out.println(hTable1);
		
		
		// 2. putAll(Map<? extends K, ? extends V> m)
		Map<Integer, String> hTable2 = new Hashtable<Integer, String>();
		
		hTable2.putAll(hTable1);
		
		System.out.println(hTable2);
		
		
		// 3. replace(K, V)
		String hs1 = hTable2.replace(1,  "가가가");
		String hs2 = hTable2.replace(4,  "라라라");
		
		System.out.println(hs1);
		System.out.println(hs2);
		System.out.println(hTable2);
		
		
		// 4. replace(K, V old, V new)
		boolean bs1 = hTable2.replace(1, "가가가", "나나나");
		boolean bs2 = hTable2.replace(2, "다다다", "라라라");
		boolean bs3 = hTable2.replace(4, "라라라", "가가가");
		
		System.out.println(bs1);
		System.out.println(bs2);
		System.out.println(bs3);
		System.out.println(hTable2);
		
		
		// 5. V get(Object K)
		System.out.println(hTable2.get(1));
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		
		// 6. containsKey(Object K)
		System.out.println(hTable2.containsKey(1));
		System.out.println(hTable2.containsKey(4));
		
		
		// 7. containsValue(Object V)
		System.out.println(hTable2.containsValue("나나나"));
		System.out.println(hTable2.containsValue("라라라"));
		
		
		// 8. Set<K> keySet()
		Set<Integer> keySet = hTable2.keySet();
		System.out.println(keySet);
		
		
		// 9. Set<Map.Entry<K, V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		
		// 10. size()
		System.out.println(hTable2.size());
		
		
		// 11. remove(Object K)
		hTable2.remove(1);
		hTable2.remove(11);
		System.out.println(hTable2);
		
		
		// 12. remove(Object K, V)
		hTable2.remove(2, "나다라");
		hTable2.remove(4, "나나나");
		System.out.println(hTable2);
		
		
		// 13. clear()
		hTable2.clear();
		System.out.println(hTable2);
		
		
		
		
		
		
		
		
		
		
//		// 포함하는 값 가져오기
//		System.out.println(hTable1.keySet().size());
//		System.out.println("입력");
//		
//		Scanner scn = new Scanner(System.in);
//		String suc = scn.next();
//		
//		for(int i = 1; i <= hTable1.keySet().size(); i++) {
//			if (hTable1.get(i).contains(suc)) {
//				System.out.println(hTable1.get(i));		
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 향상된 포문 방법
//		for (Map.Entry<Integer, String> entry : hTable1.entrySet()) {
//			if (entry.getValue().contains(suc)) {
//				System.out.println(entry.getKey() + entry.getValue());				
//			}
//		}

//        for (Map.Entry<Integer, String> entry : hTable1.entrySet()) {
//            if (entry.getValue().contains(searchKeyword)) {
//                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//            }
//        }
	}

}
