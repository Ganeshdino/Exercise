package org.example.basics.time;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeEx {

    public static void main(String[] args) {


        // Using Instant to get current UTC time
        Instant instant = Instant.now();
        System.out.println("Current UTC time (Instant): " + instant);

        // Using ZonedDateTime to get UTC time
        ZonedDateTime utcZonedDateTime = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println("Current UTC time (ZonedDateTime): " + utcZonedDateTime);

        // Using OffsetDateTime to get UTC time
        OffsetDateTime utcOffsetDateTime = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println("Current UTC time (OffsetDateTime): " + utcOffsetDateTime);

        System.out.println(ZoneId.getAvailableZoneIds().stream().filter(e->e.contains("Kolkata")).toList());

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toLocaleString());
        System.out.println(date.getDate() + "  month: " + date.getMonth());

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        System.out.println(nowDate.getMonth() + " dayofmonth "+ nowDate.getDayOfMonth() + " getDayofYear "+nowDate.getDayOfWeek());

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);

        //Calendar cal =Calendar.getInstance();

    }
}
