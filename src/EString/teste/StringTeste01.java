package Eexceptions.teste;

import java.sql.SQLOutput;

public class StringTeste01 {
    public static void main(String[] args) {


        String nome = "   Fuffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("F", "L"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(2,numeros.length()));
        System.out.println(nome.trim());
    }
}
