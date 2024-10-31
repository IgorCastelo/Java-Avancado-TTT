package Z1ClassesInternas.test;

import Zgenerics.dominio.Barco;

import java.util.Comparator;

public class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco barco1, Barco barco2) {
        return barco1.getNome().compareTo(barco2.getNome());
    }
}
