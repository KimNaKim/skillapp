package ex03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeEx02 {
    public static void main(String[] args) {
        //1. 로컬 데이트 타임 (문자열로 취급) - 다루기는 쉽지만 타 국가의 시차에 맞지 않을 수 있음
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("년: " + now1.getYear());
        System.out.println("월: " + now1.getMonthValue());
        System.out.println("일: " + now1.getDayOfMonth());
        System.out.println("시: " + now1.getHour());
        System.out.println("분: " + now1.getMinute());
        System.out.println("초: " + now1.getSecond());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");

        //시간 더하기, 날짜 더하기
        System.out.println(now1.plusHours(10).format(fmt));
        System.out.println(now1.plusDays(10).format(fmt));


    }
}
