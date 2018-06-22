package com.date.api;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Dinesh on 6/23/2018.
 */
public class DurationCheck {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.now().plusHours(24);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.now().plusHours(36);

        Duration d1 = Duration.between(time1, time2);
        Duration dt1 = Duration.between(dateTime1, dateTime2);
        Duration d2 = Duration.between(Instant.EPOCH, Instant.now());

        System.out.println(d1);
        System.out.println(dt1);
        System.out.println(d2);
    }
}
