package Eexceptions.dominio;

import java.io.FileNotFoundException;

public class Funcionario  extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoEsception{
        System.out.println("Salvando funcionario");
    }
}
