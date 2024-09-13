package collect;

import java.util.ArrayList;
import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// 1. push(E)
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		
		// 2. peek()
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.get(3));
		
		
		// 3. int search(Object)
		System.out.println(stack.search(3));
		System.out.println(stack.search(4));
		
		
		// 4. pop()
		System.out.println("pop() : " + stack.pop() + " 원본 배열 : " + stack);
		
		
		// 5. empty()
		System.out.println(stack.empty());
		System.out.println(stack);
		
		
		
		
		
		
		
		
		
		
//		ArrayList로 형변환 방법
//		ArrayList<Integer> arrayList = new ArrayList<>(stack);
		
	}

}
