package chap7.java7.chunjae;

import java.util.ArrayList;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BooksInfo> booksList = new ArrayList<BooksInfo>();
		booksList.add(new BooksInfo("젊은 베르테르의 슬픔", "괴테"));
		booksList.add(new BooksInfo("개미", "베르나르 베르베르"));
		booksList.add(new BooksInfo("어린왕자", "생텍쥐베리"));
		
		for(int i = 0; i < booksList.size(); i++) {
			BooksInfo bi = booksList.get(i);
			bi.showBooksInfo();
		}
	}

}
