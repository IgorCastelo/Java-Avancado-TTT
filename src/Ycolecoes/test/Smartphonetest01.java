package Ycolecoes.test;

import Ycolecoes.dominio.Manga;
import Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Smartphonetest01 {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone("123","Iphone");
        Smartphone sm2 = new Smartphone("123a","Sansung");
        Smartphone sm3 = new Smartphone("123455","Motorola");

        List<Smartphone> smartphones = new ArrayList<>(16);
       smartphones.add(sm1);
       smartphones.add(sm2);
       smartphones.add(sm3);
       //smartphones.clear();//limpa todas aas podsiçoes do Arraylist
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone sm4 = new Smartphone("123", "Iphone");

        System.out.println(sm4.equals(sm1));
        System.out.println(smartphones.contains(sm4));
        int indexSmartphone4 = smartphones.indexOf(sm4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));



        //  int indexSmartphone4 = smartphones.indexOf(sm4);
     //   System.out.println(smartphones.get(indexSmartphone4));
    }
}
