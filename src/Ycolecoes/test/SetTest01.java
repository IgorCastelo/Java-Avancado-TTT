package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();//LinkedHashSet cria uma lista ordenada
            mangas.add(new Manga(16L,"Pokemon", 11.00));
            mangas.add(new Manga(15L,"Helssing", 7.00));
            mangas.add(new Manga(14L,"Naruto", 16.00));
            mangas.add(new Manga(13L,"One Piece", 23.00));
            mangas.add(new Manga(12L,"Dragon ball", 23.00));
            mangas.add(new Manga(10L,"Digimon", 50.00));

            for (Manga manga : mangas) {
                System.out.println(manga);
            }
    }
}
