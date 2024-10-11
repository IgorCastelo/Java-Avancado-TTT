package polimorfismo.dominio.servico;

import polimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
        }
    }
