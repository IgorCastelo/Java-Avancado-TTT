package Eexceptions.teste;

import Eexceptions.dominio.Leitor1;
import Eexceptions.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste03 {
    public static void main(String[] args) {
        lerArquivo();
    }



public static void lerArquivo(){
    try(Leitor1 leitor1 = new Leitor1();
    Leitor2 leitor2=new Leitor2())  {

        }catch(IOException e){
            e.printStackTrace();
        }
        }
}