package Heranca.domain;

import javax.annotation.processing.SupportedSourceVersion;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Dentor do bloco de Inicialização Statico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de Inicialização NÂO estatico de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de Inicialização NÂO estatico de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);

    }

    public void relatorioPagamento(){
        System.out.println("# Relatório de Pagamento: ");
        System.out.println("Eu, " + this.nome + ", Recebi "+ this.salario + " de salário.");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }
}
