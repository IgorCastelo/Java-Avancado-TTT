package eenum.dominio;

public class Cliente {

    private String nome;
    private TIpoCliente tipoCliente;



    public Cliente(String nome, TIpoCliente tipoCliente, TipoPagamento credito) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TIpoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TIpoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getValor() +
                '}';
    }
}