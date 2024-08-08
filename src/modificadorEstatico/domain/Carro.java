package modificadorEstatico.domain;

public class Carro {
    private String nome;
    private double vrlocidadeMaxima;
    public static double velocidadeLimite =250;

    public Carro(String nome, double vrlocidadeMaxima) {
        this.nome = nome;
        this.vrlocidadeMaxima = vrlocidadeMaxima;

    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima:  "+ this.vrlocidadeMaxima);
        System.out.println("Velocidade Limíte: "+ Carro.velocidadeLimite);

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVrlocidadeMaxima() {
        return vrlocidadeMaxima;
    }

    public void setVrlocidadeMaxima(double vrlocidadeMaxima) {
        this.vrlocidadeMaxima = vrlocidadeMaxima;
    }

    public static double getVelocidadeLimite() {

        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {

        Carro.velocidadeLimite = velocidadeLimite;
    }
}
