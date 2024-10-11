package Rdatas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {


        LocalDate date = LocalDate.of(1995,11,17);
        LocalDate agora = LocalDate.now();

        System.out.println(date);
        System.out.println(agora);
        System.out.println(date.getYear());
        System.out.println(date.getEra());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.get(ChronoField.YEAR));//esse méodo deve ser simplificado, como o que está alogo a baixo
        System.out.println(date.getDayOfMonth());
        System.out.println(date);

        System.out.println("nova data: " + new Date()); //DATE
        Calendar calendar = Calendar.getInstance();//CALENDAR
        System.out.println("Calendar.getInstance()" + calendar);
        System.out.println(Month.NOVEMBER. getValue());



    }
}
