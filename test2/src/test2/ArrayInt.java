package test2;

public class ArrayInt {
	int[] numbers = {1, 2, 3};
	
	// 배열을 요따구로 뽑아낼 수도 있다.
	void printArray() {
		for(int number : numbers) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		ArrayInt arr = new ArrayInt();
		arr.printArray();
	}
}