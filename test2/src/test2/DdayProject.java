package test2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DdayProject {

	static void now(int cho1) {
		LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter [] nowArr = {
        		DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"),
        		DateTimeFormatter.ofPattern("EEEE"),
        		DateTimeFormatter.ofPattern("yyyy년"),
        		DateTimeFormatter.ofPattern("MM월"),
        		DateTimeFormatter.ofPattern("dd일"),
        		DateTimeFormatter.ofPattern("HH시"),
        		DateTimeFormatter.ofPattern("mm분"),
        		DateTimeFormatter.ofPattern("ss초"),
        };
        
        for (int i = 0; i <= 7; i++) {
        	if(cho1 - 1 == i) {
        		System.out.println(now.format(nowArr[i]));
        	}
        }
        
        
        
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		
		System.out.println("작업을 끝내시려면 0을 입력하세요.");
		System.out.println("어떤 작업을 원하시나요?");
		System.out.println("1. 현재 날짜와 시간 전체\n2. 오늘의 요일\n3. 연도\n4. 월\n5. 일 \n6. 시 \n7. 분 \n8. 초 \n9. D-Day");
		
        while (true) {
        	System.out.print("번호 : ");
        	input = scanner.nextInt();
        	
            if (input == 0) {
            	System.out.println("작업이 종료되었습니다.");
                break;
            }
            
            now(input);
        }
        
        scanner.close();
	}

}
