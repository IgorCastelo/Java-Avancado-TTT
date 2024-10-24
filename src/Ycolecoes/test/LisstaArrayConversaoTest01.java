package Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LisstaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(4);
        Integer[] lisToArray = numeros.toArray(new Integer[0]);// transforma a lista numeros em um array
        System.out.println(Arrays.toString(lisToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 1;
        numerosArray[2] = 1;

        List<Integer>  numerosToList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosToList.add(23);
        System.out.println(numerosToList);

        List<String> strings = Arrays.asList("1","1","1");// criou uma lista de strings e adicionou os valoresem suas respectivas posiç~oes
        System.out.println(strings);
        List<Integer> listInteiros = Arrays.asList(1, 1, 1, 1, 1, 1);
        System.out.println(listInteiros);



    }
}
