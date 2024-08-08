package Associacao.teste;

import Associacao.dominio.Escola;
import Associacao.dominio.Professor;

public class Escolateste01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Kakashi Sensei");
        Professor professor03 = new Professor("Guy Sensei");

        Professor[] professores = {professor01,professor02, professor03};

        Escola escola= new Escola("Konoha");

        escola.setProfessores(professores);

        escola.imprime();



    }
}
