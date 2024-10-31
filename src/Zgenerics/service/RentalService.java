package Zgenerics.service;

import Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> listaObjetosDisponiveis;

    public RentalService(List<T> listaObjetosDisponiveis) {
        this.listaObjetosDisponiveis = listaObjetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponível...");
        T t = listaObjetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(listaObjetosDisponiveis);
        return t;
    }
    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        listaObjetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(listaObjetosDisponiveis);
    }
}

/* rental service é uma classe que pode ser identificada como a camada de serviço de um sistema de aluguel. A cama de serviço em um modelo0 MVC é reponsável
 pela logica de nogocios, semparando do controlador ló. A pa*/

