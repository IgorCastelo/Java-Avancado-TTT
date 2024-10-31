package Zgenerics.service;

import Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> listaCarrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Fusca")));
    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponível...");
        Carro carro = listaCarrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Lista de carros disponíveis para alugar:");
        System.out.println(listaCarrosDisponiveis);
        return carro;
    }
    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        listaCarrosDisponiveis.add(carro);
        System.out.println("Lista de carros disponíveis para alugar:");
        System.out.println(listaCarrosDisponiveis);
    }
}
