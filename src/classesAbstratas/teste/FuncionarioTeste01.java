package classesAbstratas.teste;

import classesAbstratas.dominio.Desenvolvedor;
import classesAbstratas.dominio.Funcionario;
import classesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor= new Desenvolvedor("Igor", 12000);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
        gerente.imprime();
    }
}
