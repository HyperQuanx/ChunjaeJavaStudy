package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	
    public static void books(ArrayList<String> books) {
        System.out.println("Current books: " + books);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> booksList = new ArrayList<>();
        String input;
        
        System.out.println("종료를 원하시면 \'끝\'을 입력하세요.");
        while (true) {
            input = scanner.nextLine();
            
            if (input.equals("")||input.equals("")) {
                break;
            }
            
            booksList.add(input);
        }

        books(booksList);
        scanner.close();
    }
}
