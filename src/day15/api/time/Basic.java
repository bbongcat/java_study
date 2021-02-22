package day15.api.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {

        // 날짜 정보 얻기
        LocalDate curDate = LocalDate.now();
        System.out.println("현재 날짜: " + curDate);

        LocalDate targetDate = LocalDate.of(2022, 2, 24);
        System.out.println("목표 날짜: " + targetDate);

        // 시간 정보 얻기
        LocalTime curTime = LocalTime.now();
        System.out.println("현재 시간: " + curTime);

        LocalTime targetTime = LocalTime.of(19, 29, 30);
        System.out.println("목표 시간: " + targetTime);

        // 날짜와 시간 정보 얻기
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + curDateTime);

        System.out.println(curDateTime.getYear()); // 년도
        System.out.println(curDateTime.getMonth()); // 월(영어)
        System.out.println(curDateTime.getMonthValue()); // 월(숫자)
        System.out.println(curDateTime.getDayOfWeek()); // 요일(영어)
        System.out.println(curDateTime.getDayOfMonth()); // 일
        System.out.println(curDateTime.getDayOfYear()); // 일년중 몇일째인지
    }
}
