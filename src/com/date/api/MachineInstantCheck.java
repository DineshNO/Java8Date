package com.date.api;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;

/**
 * Created by Dinesh on 6/22/2018.
 */
public class MachineInstantCheck {

    //1970-01-01 UTC start date for Instant

    public static void main(String[] args) {
        Instant ins = Instant.now();
        System.out.println(ins);

        System.out.println(Instant.ofEpochSecond(5));
        System.out.println(Instant.ofEpochSecond(5,0));
        System.out.println(Instant.ofEpochSecond(5,10000000));
        System.out.println(Instant.ofEpochSecond(5,-10000000));
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);
        System.out.println(Instant.EPOCH);
        try {
            int day = Instant.now().get(ChronoField.NANO_OF_SECOND);
        }catch (UnsupportedTemporalTypeException e){
            System.out.println(e.getMessage());
        }
    }
}
