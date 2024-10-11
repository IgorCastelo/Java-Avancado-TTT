package Eexceptions.teste;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
           Map<String, String> shortIds = ZoneId.SHORT_IDS;//chomo o map SHORT_IDS da classe abstrata ZoneId dentro do map* shortIds
        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());
        ZoneId tokyioZone = ZoneId.of("Asia/Tokyo");// a Classe abstrata ZoneId chama a função of coma uma string  de argumento contendo a zone para a  variavel  tokyo zone do tipo ZoneID
        System.out.println(tokyioZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime1 = now.atZone(tokyioZone);
        System.out.println(zonedDateTime1);

        Instant nowInstant = Instant.now();//atribui na variavel nowInstant o metodo now() da classe Instant
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyioZone);//A variavel nowInstant, da classe Instant, utiliza oo método atZone, passando a variável tokioZone  como argumento para a variável ZoneDateTime2 do tipo ZonedDateTime

        System.out.println(zonedDateTime2);



    }
}
