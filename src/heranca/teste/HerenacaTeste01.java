package heranca.teste;

import heranca.dominio.Endereco;
import heranca.dominio.Funcionario;
import heranca.dominio.Pessoa;

public class HerenacaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua3", "60455605");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu", "11111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("---------------------");
        Funcionario funcionario = new Funcionario("Oda Nabunaga");
        funcionario.setCpf("333333");
        funcionario.setSalario(200000);
        funcionario.setEndereco(new Endereco("Rua 4", "60455604") );
        funcionario.imprime();
        funcionario.relatorioPagamento();

    }
}
