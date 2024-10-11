package Eexceptions.teste;

import Eexceptions.dominio.Funcionario;
import Eexceptions.dominio.LoginInvalidoEsception;
import Eexceptions.dominio.Pessoa;

public class SobreEscritaComExeptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoEsception e) {
            e.printStackTrace();
        }
    }
}
