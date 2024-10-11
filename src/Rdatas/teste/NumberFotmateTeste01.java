package Rdatas.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFotmateTeste01 {


    public static void main(String[] args) {
        Locale localeBR = new Locale("br", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUK = Locale.UK;
        Locale localeIT = Locale.ITALY;
        NumberFormat [] nf = new NumberFormat[5];

        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localeBR);
        nf[2] = NumberFormat.getInstance(localeJP);
        nf[3] = NumberFormat.getInstance(localeUK);
        nf[4] = null;

        double valor = 100_000.00;

        for (NumberFormat numberFormat : nf) {
            if (numberFormat!=null) {
                numberFormat.setMaximumFractionDigits(2);
                System.out.println(numberFormat.format(valor));
            }
        }
        String valorString = "1000.2130";
        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
