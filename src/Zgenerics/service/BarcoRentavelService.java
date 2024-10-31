package Zgenerics.service;

import Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> listaBarcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Canoa")));
    public Barco buscarBarcosDisponivel() {
        System.out.println("Buscando lista de barcos disponíveis...");
        Barco barco = listaBarcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println("Lista de barcos disponíveis para alugar:");
        System.out.println(listaBarcosDisponiveis);
        return barco;
    }
    public void retornarBarcosAlugado(Barco barco) {
        System.out.println("Devolvendo Barco " + barco);
        listaBarcosDisponiveis.add(barco);
        System.out.println("Lista de Barco disponíveis para alugar:");
        System.out.println(listaBarcosDisponiveis);
    }
}
