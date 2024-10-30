package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        //A primeira a entrar é a primeira a sair da fila
        Queue<Manga> filaMangas = new PriorityQueue<>(new MangaByComparator().reversed());//pode definir a prioriddade da fila
        filaMangas.add(new Manga(16L,"Pokemon", 11.00));
        filaMangas.add(new Manga(15L,"Helssing", 7.00));
        filaMangas.add(new Manga(14L,"Naruto", 16.00));
        filaMangas.add(new Manga(13L,"One Piece", 23.00));
        filaMangas.add(new Manga(12L,"Dragon ball", 23.00));
        filaMangas.add(new Manga(10L,"Digimon", 50.00));

        while (!filaMangas.isEmpty()){
            System.out.println(filaMangas.poll());
        }

    }
}
