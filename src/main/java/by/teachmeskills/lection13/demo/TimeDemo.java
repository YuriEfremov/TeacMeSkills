package by.teachmeskills.lection13.demo;

import java.time.*;
import java.util.GregorianCalendar;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow.getHour());
        System.out.println(timeNow);
LocalDate date1 = LocalDate.of(2020,6,24);
LocalDate date2 = LocalDate.now();
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        System.out.println(LocalDate.of(2020,6,24));
        System.out.println(LocalDate.ofEpochDay(365)); //start of epoch - 1970/01/01 ?
        System.out.println(LocalDate.ofYearDay(1973,124));


        LocalDateTime today= LocalDateTime.now();
        System.out.println(today);
        System.out.println(LocalDateTime.ofEpochSecond(2000,0, ZoneOffset.ofHours(-2)));
        Period period2= Period.between(date1, date2);
        System.out.println(period2.getYears() + " Years\n"
                + period2.getMonths() + " Months\n"
                + period2.getDays() + " Days");
        System.out.println(period2);

    }
}
