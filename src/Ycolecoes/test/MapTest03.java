package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Matheus Faustino");
        System.out.println(consumidor1);
        Consumidor consumidor2 = new Consumidor("Nary chan");
        System.out.println(consumidor1);

        Manga manga = new Manga(16L, "Pokemon", 11.00);
        Manga manga1 = new Manga(15L, "Helssing", 7.00);
        Manga manga2 = new Manga(14L, "Naruto", 16.00);
        Manga manga3 = new Manga(13L, "One Piece", 23.00);
        Manga manga4 = new Manga(12L, "Dragon ball", 23.00);
        Manga manga5= new Manga(10L, "Digimon", 50.00);

        List<Manga> mangaConsumidor1List = List.of(manga1,manga2);
        List<Manga> mangaConsumidor2List = List.of(manga3,manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap= new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2,mangaConsumidor2List);
        System.out.println("-------------------------------");
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + ": ");
            for (Manga posicao : entry.getValue()) {
                System.out.println(posicao.getNome());
            }
            System.out.println("----------------------------");

        }

        }


    }

