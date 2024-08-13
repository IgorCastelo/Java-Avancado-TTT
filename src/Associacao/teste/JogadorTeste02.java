package Associacao.teste;

import Associacao.dominio.Jogador;
import Associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador01.setTime(time);
        jogador01.imprime();
    }
}
