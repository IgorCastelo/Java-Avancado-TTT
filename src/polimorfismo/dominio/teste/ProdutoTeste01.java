package polimorfismo.dominio.teste;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Tomate;
import polimorfismo.dominio.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        tomate.setDataValidade("17/11/2024");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("__________________________________");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
