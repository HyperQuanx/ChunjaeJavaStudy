package test;

public class Test2ObjectArrayTest3 {

	public static void main(String[] args) {
		Test2ObjectArrayTest1[] library = new Test2ObjectArrayTest1[5];
		for(int i = 0; i < library.length; i++) {
			library[i] = new Test2ObjectArrayTest1("책 제목" + (i + 1), "책 저자" + (i + 1));
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
