package Eexceptions.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {

        System.out.println("1");
        LocalDate now = LocalDate.now();
        System.out.println(now.plusDays(28));// ADICIONA DIAS A MAIS NA DATA
        System.out.println(now);

        System.out.println("2");
        now = LocalDate.now().with(ChronoField.DAY_OF_MONTH, 28); // ADICIONA DIAS A MAIS NA DATA SEM VIRAR O MMES OU SEMANA/ANO (CHRONOFiELD)
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("3");
        now =  LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));//informa o procimo SUNDAY
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("4");
        now =  LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));//informa o proximo ou se é SUNDAY
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("5");
        now =  LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));//informao ultimo é SUNDAY
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("6");
        now =  LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());//informa o primeiro dia do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("6");
        now =  LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear()); //informa o primeiro dia do ano
        System.out.println(now);
        System.out.println(now.getDayOfWeek());








    }
}
