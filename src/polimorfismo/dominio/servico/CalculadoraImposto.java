package polimorfismo.dominio.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto + "%");
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;//SE O PRODUTO QUE FOR COLOCADO NA VARIAVEL TOMATE FOR DIFERENTE DA SUBCLASSE DA ERRO NO JAVA
            System.out.println("VALIDADE: " + tomate.getDataValidade());
        }

    }

}
