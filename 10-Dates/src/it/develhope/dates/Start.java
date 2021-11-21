package it.develhope.dates;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Start {

    public static void main(String ...args){
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.now();
        tomorrow = tomorrow.plus(1, ChronoUnit.DAYS).plus(1, ChronoUnit.MONTHS);

        System.out.println("Day " + today.getDayOfWeek().ordinal());
        System.out.println("Month " + today.getMonth());
        System.out.println("Year " + today.getYear());

        System.out.println("Day " + tomorrow.getDayOfWeek());
        System.out.println("Month " + tomorrow.getMonth());
        System.out.println("Year " + tomorrow.getYear());

        System.out.println("IsAfter " + today.isAfter(tomorrow));
        System.out.println("IsBefore " + today.isBefore(tomorrow));
        System.out.println("IsLeapYear " + today.isLeapYear());
        System.out.println("To String " + today.toString());


        System.out.println("-------------- Time -------------- ");
        LocalTime now = LocalTime.now();
        System.out.println("Hour " + now.getHour());
        System.out.println("Minute " + now.getMinute());
        System.out.println("Second " + now.getSecond());

        LocalTime now2 = LocalTime.now().plusHours(1).plusMinutes(2).plusSeconds(3);
        System.out.println("Hour " + now2.getHour());
        System.out.println("Minute " + now2.getMinute());
        System.out.println("Second " + now2.getSecond());

        System.out.println("-------------- Date -------------- ");
        Date myDate = new Date();
        Date myDate2 = new Date(2022,11,13,00,00,00);
        long myDateTime = myDate.getTime();
        long date2Time = myDate2.getTime();
        long diffInMs = date2Time - myDateTime;
        System.out.println("Diff in MS " + diffInMs);

        System.out.println("-------------- Between -------------- ");
        LocalDate date1 = LocalDate.of(2021,04,10);
        LocalDate date2 = LocalDate.of(2022,12,10);
        LocalDate dateBetween = LocalDate.now();

        if(date1.isBefore(dateBetween)  && date2.isAfter(dateBetween)){
            System.out.println("The date is between " + date1 + " and " + date2 );
        }else{
            System.out.println("The date is outside");
        }

        System.out.println("-------------- Date Formatter -------------- ");
        System.out.println("Date formatted " + date1.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));
        System.out.println("Date formatted time " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));



    }
}
