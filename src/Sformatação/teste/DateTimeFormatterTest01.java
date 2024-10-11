package Sformatação.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //A função format da classe Localdate transforma objeto DateTomeFormatter em string
        LocalDate localDate = LocalDate.now();
        String formatter1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String formatter2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String formatter3= localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("String Formatter: " + formatter1);
        System.out.println("String Formatter: " + formatter2);
        System.out.println("String Formatter: " + formatter3);

        //A função parse da classe LocalDate transforma String em um objeto DateTomeFormatter
        LocalDate parse1 = LocalDate.parse(formatter1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Objeto parse String: " + parse1);
        LocalDate parse2 = LocalDate.parse(formatter2,DateTimeFormatter.ISO_DATE);
        System.out.println("Objeto parse String: " + parse2);
        LocalDate parse3 = LocalDate.parse(formatter3,DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Objeto parse String: " + parse3);

        System.out.println("LocalDateTime: ");
        LocalDateTime now = LocalDateTime.now();
        String form1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(form1);
        String form2 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(form2);
        LocalDateTime parse4 = LocalDateTime.parse("2024-10-08T17:00:52.9915602",DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        LocalDateTime parse5 = LocalDateTime.parse(form2,DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(parse5);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDateTime.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("17/11/1995" ,  formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatadorGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatoGR = LocalDateTime.now().format(formatadorGR);
        System.out.println(formatoGR);
        LocalDate parseGR = LocalDate.parse("17.November.1995" ,formatadorGR);
        System.out.println(parseGR.toString());



    }
}
