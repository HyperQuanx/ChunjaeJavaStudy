package test2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import java.util.Scanner;


public class Dday {

	public static void dDay() {
		LocalDate today = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowTodayTime = LocalDateTime.now();
		
		
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 EEEE HH시 mm분 ss초");
        String formattedDateTime = now.format(formatter);
        

		System.out.println(today);
		System.out.println(nowTime);
		System.out.println(nowTodayTime);
		System.out.println(formattedDateTime);
	}
	
	public static void main(String[] args) {
		dDay();

	}

}
