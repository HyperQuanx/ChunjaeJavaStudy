package collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
//		if(q1 != null && !(q1.isEmpty())) {			
//			System.out.println(q1.element());
//		}
		
		try {
			System.out.println(q1.element());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		q1.add(3);
		q1.add(4);
		q1.add(5);
		System.out.println(q1.element());
		
		// false가 나옴 왜?
		System.out.println(q1.remove(q1));
		
		System.out.println(q1);
		
		
		// offer
		/*
		주요 차이점: offer() vs add()
		offer(): 큐에 요소를 추가하고 성공 시 true, 실패 시 false 를 반환합니다. 예외를 던지지 않습니다.
		add(): 요소 추가에 실패하면 예외를 던집니다.
		 */
		Queue<Integer> q2 = new LinkedList<Integer>();
		q2.add(1);
		q2.add(2);
		q2.add(3);
		q2.addAll(q1);
		System.out.println(q2);
		// q2.remove();
		System.out.println(q2);
		// q2.remove(5);
		q2.removeAll(q1);
		System.out.println(q2);
		q2.offer(1);
		q2.offer(3);
		System.out.println(q2);
		
		
		// peek()
		System.out.println(q2.peek());
	}

}
