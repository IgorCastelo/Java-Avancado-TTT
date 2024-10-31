package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.BarcoRentavelService;
import Zgenerics.service.CarroRentavelService;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericatest03 {
    public static void main(String[] args) {
        /*BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcosDisponivel();
        System.out.println("Usando carro por 1 mes");
        barcoRentavelService.retornarBarcosAlugado(barco);
    */
        List<Carro> listaCarrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Fusca")));//lista passada geralmente por banco de dados
        List<Barco> listaBarcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Canoa")));

        RentalService <Carro> rentalServiceCarro = new RentalService<>(listaCarrosDisponiveis);// A classe de service recebe um tipo de serviço qualquer por ela ser generica
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();// depois o objeto generico chama a função que recebe o tipo generico
        rentalServiceCarro.retornarObjetoAlugado(carro);

        RentalService<Barco> rentalServiceBarco = new RentalService<>(listaBarcosDisponiveis);// criação da classe generica rental service
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel(); //chamada da função buscar objetos
        rentalServiceBarco.retornarObjetoAlugado(barco);


    }
 }
