package collect;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] arr = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		arr[2] = null;
		arr[5] = null;
		System.out.println(arr.length);
		
		List<String> arrList = new ArrayList<>();
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("라");
		arrList.add("마");
		arrList.add("바");
		arrList.add("사");
		arrList.remove("다");
		arrList.remove("바");
		System.out.println(arrList.size());
		System.out.println(arrList); // 주소가 아니라 값이 나오는 이유는 객체를 순회하면서 출력하게끔 로직이 구현되어 있음
	}

}
