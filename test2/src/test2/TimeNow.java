package test2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeNow {
    public static void main(String[] args) {
        // 한국 표준시 (KST) ZoneId
        ZoneId kstZone = ZoneId.of("Asia/Seoul");
        
        // 현재 시간을 한국 시간대로 가져오기
        ZonedDateTime kstTime = ZonedDateTime.now(kstZone);
        
        // 시간 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        // 한국 시간 출력
        String formattedKSTTime = kstTime.format(formatter);
        System.out.println("현재 한국 시간: " + formattedKSTTime);
    }
}
