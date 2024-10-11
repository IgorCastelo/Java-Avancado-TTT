package polimorfismo.dominio;

public class Tomate extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate "); //TODO METODO DEVE POSSUIR UME MENSSAGEM INFORMANDO SUA FUNCIONALIDADE NELE
        return this.valor * IMPOSTO_POR_CENTO;
    }


    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

}