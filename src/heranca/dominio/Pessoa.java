package heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;

    protected Endereco endereco;
    static {
        System.out.println("Dentor do bloco de Inicialização Statico de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de Inicialização NÂO estatico de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de Inicialização NÂO estatico de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do contrutor Pessoa");
        this.nome = nome;

    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Rua: "+this.endereco.getRua());
        System.out.println("Cep: " + this.endereco.getCep());
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }
}
