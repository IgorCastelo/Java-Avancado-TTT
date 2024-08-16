package eenum.dominio;

public enum TIpoCliente {
PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    private int valor;
    private String nomeRelatorio;

    TIpoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TIpoCliente tipoclientePorNomeRelatorio(String nomeRelatorio){
        for(TIpoCliente tipoCliente: values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
    TIpoCliente(int valor) {
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }

}
