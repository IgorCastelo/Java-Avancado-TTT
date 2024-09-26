package Eexceptions.teste;

import java.io.File;
import java.io.IOException;

public class EExceptionTeste03 {
    public static void main(String[] args) throws IOException {
        abreConexao();

    }

    private static String abreConexao() throws IOException {
        try {
            System.out.println("Abrindo carquivo");
            System.out.println("Escreendo dados no arquivo");
            return "conexao aberta";

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recursos liberados pelo SQ");
        }
    return null;
    }
}