package Associacao.teste;

import Associacao.dominio.Jogador;
import Associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("KAKA");
        Jogador jogador03 = new Jogador("Ronaldinho Gaucho");

        Time time = new Time("Brazil");


        Jogador [] jogadores= {jogador01, jogador02, jogador03};


        jogador01.setTime(time);
        jogador02.setTime(time);
        jogador03.setTime(time);

        time.setJogadores(jogadores);


        System.out.println("--Jogador: ");
            jogador01.imprime();



        System.out.println("--Time: ");
        time.imprime();



    }
}
