package Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("pivet", "menino");
        map.put("de rocha!", "gostei!");
        map.put("é sal!", " dá certo!");
        System.out.println(map);

        for (String key: map.keySet()){
            System.out.println(key + " : " + map.get(key));//mostra o valor da quela chave "key"
        }

        System.out.println("----------------------------------");

        for (String value: map.values()){
            System.out.println(value);//mostra os valors do map
        }
        System.out.println("--------------------------------------");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());// invoca um objeto que recebe tanto as chaves quanto os valores
        }

    }
}
