package Rdatas.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFotmatTeste02 {


    public static void main(String[] args) {
        Locale localeBR = new Locale("br", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUK = Locale.UK;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[5];

        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeBR);
        nf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nf[3] = NumberFormat.getCurrencyInstance(localeUK);
        nf[4] = null;

        double valor = 100.000;

            for (NumberFormat numberFormat : nf) {
                try {
                    System.out.println(numberFormat.format(valor));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
     }
    }
}
