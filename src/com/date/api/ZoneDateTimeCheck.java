package com.date.api;

import java.time.*;
import java.time.chrono.JapaneseDate;

/**
 * Created by Dinesh on 6/23/2018.
 */
public class ZoneDateTimeCheck {

    public static void main(String[] args) {
        ZoneId romeZone = ZoneId.of("Europe/Rome");

        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zdt1 = date.atStartOfDay(romeZone);

        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(romeZone);

        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(romeZone);

        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);

        Instant instantFromDateTime = dateTime.toInstant(ZoneOffset.MIN);
        LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant, romeZone);

        System.out.println(instantFromDateTime);
        System.out.println(timeFromInstant);

        LocalDate newdate = LocalDate.of(2014, Month.MARCH, 18);
        JapaneseDate japaneseDate = JapaneseDate.from(date);
        System.out.println(japaneseDate);
    }
}
