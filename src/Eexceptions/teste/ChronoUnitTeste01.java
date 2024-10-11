package Eexceptions.teste;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime igor = LocalDateTime.of(1995, Month.NOVEMBER, 17, 9, 00, 00);
        LocalDateTime francisca = LocalDateTime.of(1952, Month.JANUARY, 1, 9, 00, 00);
        //LocalDateTime   = LocalDateTime.of(1952, Month.JANUARY, 1, 9,00 ,00);
        //LocalDateTime now = LocalDateTime.now();


        LocalDateTime[] aniversarios = new LocalDateTime[2];
        aniversarios[0] = igor;
        aniversarios[1] = francisca;


            for (LocalDateTime localDateTime : aniversarios) {
                System.out.println(ChronoUnit.DAYS.between(localDateTime, LocalDateTime.now()));
                System.out.println(ChronoUnit.WEEKS.between(localDateTime, LocalDateTime.now()));
                System.out.println(ChronoUnit.MONTHS.between(localDateTime, LocalDateTime.now()));
                System.out.println(ChronoUnit.YEARS.between(localDateTime, LocalDateTime.now()));
            }
 

    }
}
