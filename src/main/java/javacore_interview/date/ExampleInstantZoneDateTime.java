package javacore_interview.date;

import java.time.*;

public class ExampleInstantZoneDateTime {
    public static void main(String[] argv) {


        Instant now = Instant.now();
        System.out.println("Instant : " + now);


        ZonedDateTime japanTime = now.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime : " + japanTime);
        System.out.println("OffSet : " + japanTime.getOffset());


        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 57, 38);


        ZonedDateTime singaporeTime = dateTime.atZone(ZoneId.of("Asia/Singapore"));

        System.out.println("ZonedDateTime : " + singaporeTime);


        now = singaporeTime.toInstant();

        System.out.println("Instant : " + now);
    }
}