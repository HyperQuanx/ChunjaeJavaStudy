package collect;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// vector 를 사용하는 이유? 동기화 이슈 때문
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E)
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println(vector1);
		
		// 2. add(index, E)
		vector1.add(1, 6);
		System.out.println(vector1);
		
		vector1.remove(1);
		System.out.println(vector1);
		
		List<Integer> vector2 = new Vector<Integer>();
		vector2.add(1);
		vector2.add(2);
		vector2.addAll(vector1);
		System.out.println(vector2);
		
//		vector2.removeAll(vector1); // 한 방에 지울 때
//		System.out.println(vector2);
		
		// 리스트 --> 배열
		// toArray()
		Object[] obj = vector2.toArray();
		System.out.println(obj.toString()); // 주소 가져옴
		System.out.println(Arrays.toString(obj)); // 모든 요소 가져옴
		
		// toArray(T[] t)
		Integer[] arrInt = vector2.toArray(new Integer[0]); // 편법으로 많이 쓰임 
		System.out.println(arrInt);
		System.out.println(Arrays.toString(arrInt));
		
		
	}

}
