package com.date.api;

import java.time.*;

/**
 * Created by Dinesh on 6/22/2018.
 */
public class LocalDateTimeCheck {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime dateTime = LocalDateTime.now(Clock.systemUTC()); //GMT
        System.out.println(dateTime);

        // 2014-03-18T13:45:20
        LocalDate date = LocalDate.parse("2014-03-18");
        LocalTime time = LocalTime.parse("13:45:20");
        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);

        LocalDate d1 = dt1.toLocalDate();
        LocalTime t1 = dt1.toLocalTime();
        System.out.println(d1 + "  " + t1);

    }
}
