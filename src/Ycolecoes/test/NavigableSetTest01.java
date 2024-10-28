package Ycolecoes.test;

import Ycolecoes.dominio.Manga;
import Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class smartphoneMacadorComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone>set  = new TreeSet<>(new smartphoneMacadorComparator());
        set.add(new Smartphone("13L", "sansu"));
        set.add(new Smartphone("13L", "sang"));
        set.add(new Smartphone("13L", "sansung"));
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaByComparator());
        mangas.add(new Manga(16L,"Pokemon", 11.00, 300));
        mangas.add(new Manga(15L,"Helssing", 7.00,500));
        mangas.add(new Manga(14L,"Naruto", 16.00,3000));
        mangas.add(new Manga(13L,"One Piece", 23.00,3000));
        mangas.add(new Manga(12L,"Dragon ball", 23.00,250));
        mangas.add(new Manga(10L,"Digimon", 50.00,150));

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        //comoparar os elementos do treeset
        //lower <
        //floor <=
       //higher >
        //ceiling>=
        Manga newManga =new Manga(10L,"Digimon10x", 16.00,1000);
        System.out.println("LowerTo:"+mangas.lower(newManga));
        System.out.println("FloorTo:"+mangas.floor(newManga));
        System.out.println("HigherTo:"+mangas.higher(newManga));
        System.out.println("CeilingTo:"+mangas.ceiling(newManga));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

        System.out.println(mangas);




    }
}
