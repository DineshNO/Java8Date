/**
 * Created by Dinesh on 6/22/2018.
 */
package com.date.api;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

import static java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;

public class LocalDateCheck {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
        System.out.println(now.get(ChronoField.DAY_OF_WEEK));
        System.out.println(now.get(ChronoField.DAY_OF_YEAR));
        System.out.println(now.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println(now.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        System.out.println("===========================================================================");
        LocalDate date = LocalDate.of(1985,05,05);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());

    }
}
