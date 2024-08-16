package eenum.dominio;

public enum TIpoCliente {
PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    public final int VALOR;
    TIpoCliente(int valor) {
        this.VALOR=valor;
    }


}
