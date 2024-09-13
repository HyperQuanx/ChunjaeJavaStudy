package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCreate {

	public static void main(String[] args) {
		List<Integer> arrList1 = new ArrayList<Integer>(); // capcity : 10
		List<Integer> arrList2 = new ArrayList<Integer>(10); // capcity : 30
		arrList1.add(1);
		arrList1.add(2);
		arrList1.add(3);
		arrList1.add(4);
		arrList1.add(5);
		arrList1.add(6);
		arrList1.add(7);
		arrList1.add(8);
		arrList1.add(9);
		arrList1.add(10);
//		System.out.println(arrList1.size());
//		System.out.println(arrList1.isEmpty()); // false
//		
//		arrList1.clear();
//		System.out.println(arrList1.size());
//		System.out.println(arrList1.isEmpty()); // true
		
//		List<Integer> arrList3 = Arrays.asList(1, 2, 3, 4, 5);
//		arrList3.set(1, 8); // 1 번째 값을 8 로 바꾼다.
//		System.out.println(arrList3);
//		arrList3.remove(0); // 추가 삭제 불가능 (add 도 불가능)
		
		// addAll(Collection <? extends E> c)
		arrList2.add(1);
		arrList2.add(2);
		arrList2.add(3);
//		arrList2.addAll(arrList1);
		System.out.println(arrList1.size());
//		System.out.println(arrList2); // 자동으로 사이즈 증가가 됨.
		
		// addAll(int index, Collection <? extends E> c)
		arrList2.addAll(1, arrList1);
		System.out.println(arrList2); // 지정한 인덱스 부터 arrList1이 추가가 된 채로 출력됨
		
		
	}

}
