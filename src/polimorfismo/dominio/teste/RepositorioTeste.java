package polimorfismo.dominio.teste;

import polimorfismo.dominio.repositorio.Repositorio;
import polimorfismo.dominio.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {


        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }
}
