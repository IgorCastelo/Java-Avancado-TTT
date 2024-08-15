package heranca.teste;

import heranca.dominio.Funcionario;
// 1 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
// 2 - Alocado espaço em memória para o objeto e executado o JVM carregar classe filha
// 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
// 4 - Construtor de inicialização da superclasse é executado na ordem em que aparece
// 5 - Bloco de inicialização da superclasse é executado
// 6 - Alocando espaço em memória para o objeto da subclasse
// 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
// 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario("Jiraya");

    }
}
