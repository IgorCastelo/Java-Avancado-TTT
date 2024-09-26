package Eexceptions.teste;

import Eexceptions.dominio.Leitor1;
import Eexceptions.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste02 {
    public static void main(String[] args) {

    }



    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
        }
    }
}
   try(
Leitor1 leitor1 = new Leitor1();
Leitor2 leitor2=new Leitor2()){

        }catch(IOException e){

        }
        }