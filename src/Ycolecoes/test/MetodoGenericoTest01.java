package Ycolecoes.test;

import Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
    //criarArrayComUmObjeto(new Barco("Gm Motors Lancha"));
        List<Barco> listaBarcos = criarArrayComUmObjeto(new Barco("Gm Motors Lancha"));
        System.out.println(listaBarcos);

    }
    /*private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }*/
    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);

    }
    private static <T extends Comparable<T>> List<T> criarArrayComUmObjetoComComparable(T t) {
        return List.of(t);

    }
}