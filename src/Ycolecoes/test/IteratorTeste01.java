package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> portifolioMangas = new LinkedList<>();
        portifolioMangas.add(new Manga(16L, "Pokemon", 11.00, 0));
        portifolioMangas.add(new Manga(15L, "Helssing", 7.00, 200));
        portifolioMangas.add(new Manga(14L, "Naruto", 16.00, 111));
        portifolioMangas.add(new Manga(13L, "One Piece", 23.00, 777));
        portifolioMangas.add(new Manga(12L, "Dragon ball", 23.00, 111));
        portifolioMangas.add(new Manga(10L, "Digimon", 50.00, 12));
        System.out.println(portifolioMangas);

        Iterator<Manga> mangaIterator = portifolioMangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }

            System.out.println(portifolioMangas);
        }
    }
}