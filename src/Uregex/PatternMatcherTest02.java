package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto1 = "abababa";

        Pattern pattern = Pattern.compile(regex);//compíla
        Matcher matcher = pattern.matcher(texto1);// procurar o pattern no text

        System.out.println("texto: " + texto1);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){ //enquanto encontrar o texto que est´s no matcher
            System.out.println(matcher.start());// contar e mostrar a o valor da posição em que começou a contar
        }
    }
}
