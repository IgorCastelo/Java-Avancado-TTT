package iinterface.teste;

import iinterface.dominio.DataBaseLoader;
import iinterface.dominio.DataLoader;
import iinterface.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();

        fileLoader.checkPermission();
        dataBaseLoader.checkPermission();

    }
}