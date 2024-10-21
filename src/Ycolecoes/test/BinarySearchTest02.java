package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByComparator2 implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return  Long.compare(o1.getId(),o2.getId());
    }
}
public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByComparator2 mangaByComparator2 = new MangaByComparator2();
        MangaByComparator mangaByComparator = new MangaByComparator();
        List<Manga> portifolioMangas = new ArrayList<>();
        portifolioMangas.add(new Manga(1L,"Pokemon", 11.00));
        portifolioMangas.add(new Manga(2L,"Helssing", 7.00));
        portifolioMangas.add(new Manga(3L,"Naruto", 16.00));
        portifolioMangas.add(new Manga(4L,"One Piece", 23.00));
        portifolioMangas.add(new Manga(5L,"Dragon ball", 23.00));
        //portifolioMangas.add(new Manga(6L,"Digimon", 50.00));

       portifolioMangas.sort(mangaByComparator2);
        for (Manga mangas : portifolioMangas) {
            System.out.println(mangas);
            }
        Manga mangaToSearch = new Manga(1L,"Pokemon", 11.00);
        System.out.println(Collections.binarySearch(portifolioMangas,mangaToSearch,mangaByComparator2));
    }

}
