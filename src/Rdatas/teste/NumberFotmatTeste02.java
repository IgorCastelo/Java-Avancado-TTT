package Rdatas.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFotmateTeste01 {


    public static void main(String[] args) {
        Locale localeBR = new Locale("br", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUK = Locale.UK;
        Locale localeIT = Locale.ITALY;
        NumberFormat [] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getInstance();
        nf[0] = NumberFormat.getInstance(localeBR);
        nf[0] = NumberFormat.getInstance(localeJP);
        nf[0] = NumberFormat.getInstance(localeUK);
        nf[0] = NumberFormat.getInstance(localeIT);

        double valor= 100_000.00;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));

        }


    }

}
