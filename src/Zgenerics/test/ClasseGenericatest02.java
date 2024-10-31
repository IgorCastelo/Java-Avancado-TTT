package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.BarcoRentavelService;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericatest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcosDisponivel();
        System.out.println("Usando carro por 1 mes");
        barcoRentavelService.retornarBarcosAlugado(barco);
    }
}
