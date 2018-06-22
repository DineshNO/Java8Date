package com.date.api;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Dinesh on 6/23/2018.
 */
public class JavaPeriodCheck {

    public static void main(String[] args) {
        Period tenDays = Period.between(LocalDate.of(2014, 3, 8),
                LocalDate.of(2014, 3, 18));
        System.out.println(tenDays);

        Period _10Days = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
    }
}

