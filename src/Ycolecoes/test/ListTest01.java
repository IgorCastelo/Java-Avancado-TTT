package Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>( 3); // 1.
        List<String> nomes2 = new ArrayList<>( 3); // 1.
        nomes.add("Igor Castelo");
        nomes.add("Familia Castelo");
        nomes2.add("Francisca Carneiro de Freitas Castelo");
        nomes2.add("Familia Castelo");

        nomes.addAll(nomes2);//Inserir uma lista dentro de outra
        for ( String name : nomes){
            System.out.println(name);
        }
        
        System.out.println("--------");
        //int size = nomes.size()+10;
        //System.out.println(size);
        for(int i = 0; i < nomes.size(); i++) {
            //nomes.add("Suane");
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);
    }
}
