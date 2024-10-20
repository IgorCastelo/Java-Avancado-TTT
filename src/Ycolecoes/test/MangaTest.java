package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class MangaByComparator implements Comparator<Manga> {


    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(),manga2.getPreco());
    }
}
public class MangaTest {
    public static void main(String[] args) {
        List<Manga> portifolioMangas = new ArrayList<>();
        portifolioMangas.add(new Manga(16L,"Pokemon", 11.00));
        portifolioMangas.add(new Manga(15L,"Helssing", 7.00));
        portifolioMangas.add(new Manga(14L,"Naruto", 16.00));
        portifolioMangas.add(new Manga(13L,"One Piece", 23.00));
        portifolioMangas.add(new Manga(12L,"Dragon ball", 23.00));
        portifolioMangas.add(new Manga(10L,"Digimon", 50.00));

        for (Manga mangas : portifolioMangas) {
            System.out.println(mangas);
        }

        Collections.sort(portifolioMangas);

        System.out.println("Depois da Reordenação para ordem alfabetica");
        for (Manga mangas : portifolioMangas) {
            System.out.println(mangas);
        }
        //Collections.sort(portifolioMangas, new MangaByComparator());//legado
        portifolioMangas.sort(new MangaByComparator());
        System.out.println("Depois do  uso da interface COMPARATOR para aplicar a distribuição da ordem dos mangas pelo preço");
        for (Manga mangas : portifolioMangas) {
            System.out.println(mangas);
        }


    }
}
