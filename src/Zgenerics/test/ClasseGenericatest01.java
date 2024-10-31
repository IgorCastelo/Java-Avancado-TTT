package Zgenerics.test;

import Zgenerics.dominio.Carro;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericatest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por 1 mes");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
