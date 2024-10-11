package Rdatas.teste;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date1 = LocalDate.of(1995,11,17);
        LocalDate date2 = LocalDate.parse("1995-11-17");
        LocalTime time1 = LocalTime.parse("09:45:26");
        LocalTime time2 = LocalTime.of(9,45,26);

        LocalDateTime ldt1 = date1.atTime(time1);
        LocalDateTime ldt2 = time2.atDate(date2);

        System.out.println(dateTime);
        System.out.println(date1);
        System.out.println("String: " + date2);
        System.out.println(time1);
        System.out.println("String: " + time2);
        System.out.println("LTD1: " + ldt1);
        System.out.println("LTD2: " + ldt2);

    }
}
