package Eexceptions.teste;

import java.io.File;
import java.io.IOException;

public class EExceptionTeste01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\teste.txt");
       try{
           boolean isCriado = file.createNewFile();
           System.out.println("Arquivo Criado" + isCriado);

        }catch(IOException e){
            e.printStackTrace();
       }
    }
}
