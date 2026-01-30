package ex03;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeEx01 {
    public static void main(String[] args) {
        // 1. 로컬 데이트 타임
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        // 2. 존 설정해서 시간 설정 후 출력(X)
        ZonedDateTime now2 = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println(now2);

        // 3. Instant 시간
        Instant now3 = Instant.now();
        System.out.println(now3);
        ZonedDateTime kst = now3.atZone(ZoneId.of("Asia/Seoul"));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(kst.format(fmt));

        // 4. Timestamp (구버전) - 시간이 변환되어 출력됨
        Timestamp now4 = new Timestamp(1000 * 300);
        System.out.println(now4);
        Timestamp now5 = new Timestamp(System.currentTimeMillis());
        System.out.println(now5);
    }
}
