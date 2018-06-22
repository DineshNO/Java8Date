package com.date.api;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Dinesh on 6/22/2018.
 */
public class LocalTimeCheck {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        LocalTime time = LocalTime.parse("13:45:20");
        System.out.println(time);
    }

}
