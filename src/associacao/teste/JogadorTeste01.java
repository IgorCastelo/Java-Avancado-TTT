package associacao.teste;

import associacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Endrick");
        Jogador jogador2 = new Jogador("Vinicius JR");
        Jogador jogador3 = new Jogador("Ronaldinho Gaucho");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }


}

