package Rdatas.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime timeNow= LocalTime.now();
        LocalTime time = LocalTime.of(23, 10, 2);

        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);


    }
}
