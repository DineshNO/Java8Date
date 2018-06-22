/**
 * Created by Dinesh on 6/22/2018.
 */
package com.date.api;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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


        LocalDate parseDate = LocalDate.parse("2014-03-18");
        System.out.println(parseDate);

        LocalDate d1 = LocalDate.of(2020,02,28);
        LocalDate d2 = d1.withYear(2018);
        LocalDate d3 = d1.withDayOfYear(154);

        System.out.println(d1);
        System.out.println(d2); System.out.println(d3);

        LocalDate checkDay = LocalDate.of(2020,06,02);
        System.out.println(checkDay.getDayOfYear());

        System.out.println(DayOfWeek.FRIDAY);

        LocalDate date1 = LocalDate.parse("20140318",
                DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2014-03-18",
                DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(date1);
        System.out.println(date2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate formatDate = LocalDate.of(2014, 3, 18);
        String formattedDate = formatDate.format(formatter);
        LocalDate dateFormatted = LocalDate.parse(formattedDate, formatter);

        System.out.println(formattedDate);System.out.println(dateFormatted);

    }
}
