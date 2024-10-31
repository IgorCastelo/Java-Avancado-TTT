package Z1ClassesInternas.test;



import Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnoymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> listaBarcos = new ArrayList<>(List.of(new Barco("Lancha ferrari"), new Barco("Barco MBW")));
        listaBarcos.sort(new Comparator<Barco>() {
                             @Override
                             public int compare(Barco barco1, Barco barco2) {
                                 return barco1.getNome().compareTo(barco2.getNome());
                             }
                         }
        );
        System.out.println(listaBarcos);
    }
}


