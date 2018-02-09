package javacore_interview.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.SATURDAY;

public class Examples {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("now : "+ ld);

        LocalDate nextFriday = ld.with(TemporalAdjusters.next(FRIDAY));
        System.out.println("next friday : " + nextFriday);

        LocalDate nextDecade = ld.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after 10 year on : " + nextFriday);

        LocalDate now2 = LocalDate.now();
        LocalDate firstInYear = LocalDate.of(now2.getYear(), now2.getMonth(),1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(SATURDAY))
                .with(TemporalAdjusters.next(SATURDAY));
        System.out.println("Second saturday on : "+secondSaturday);
    }
}