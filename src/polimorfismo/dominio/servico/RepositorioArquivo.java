package polimorfismo.dominio.servico;

import polimorfismo.dominio.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
