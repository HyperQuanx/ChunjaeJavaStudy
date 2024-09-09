package test2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestT {
    public static void C(LocalDate day) {
        LocalDate now = LocalDate.now();
        long dDay = ChronoUnit.DAYS.between(now, day);
        System.out.println(dDay > 0 ? dDay + "일 남았습니다." : dDay + "일 전입니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int dayOfMonth = 0;

        System.out.println("D-day를 계산할 날짜의 연도를 입력하세요: ");
        while(true) {
            try {
                year = scanner.nextInt();
                if(year > 9999 || year < 1) {
                    System.out.println("연도는 1~9999 사이의 숫자를 입력해야 합니다. 다시 입력해주세요.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next();
            }
        }

        System.out.println("D-day를 계산할 날짜의 월을 입력하세요: ");
        while(true) {
            try {
                month = scanner.nextInt();
                if(month > 12 || month < 1) {
                    System.out.println("월은 1~12 사이의 숫자를 입력해야 합니다. 다시 입력해주세요.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next();
            }
        }

        System.out.println("D-day를 계산할 날짜의 일을 입력하세요: ");
        while(true) {
            try {
                dayOfMonth = scanner.nextInt();
                if (dayOfMonth < 1 || dayOfMonth > 31) {
                    System.out.println("날짜는 1~31 사이의 숫자를 입력해야 합니다. 다시 입력해주세요.");
                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && dayOfMonth > 30) {
                    System.out.println("해당 월은 30일까지 있습니다. 다시 입력해주세요.");
                } else if (month == 2) {
                    if (isLeapYear(year)) {
                        if (dayOfMonth > 29) {
                            System.out.println("윤년이므로 2월은 29일까지 있습니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    } else {
                        if (dayOfMonth > 28) {
                            System.out.println("2월은 28일까지 있습니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next();
            }
        }

        LocalDate dDayDate = LocalDate.of(year, month, dayOfMonth);

        C(dDayDate);

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
