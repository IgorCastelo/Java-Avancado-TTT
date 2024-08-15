package eenum.teste;

import eenum.dominio.Cliente;
import eenum.dominio.TIpoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TIpoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Ryu", TIpoCliente.PESSOA_FISICA);
        System.out.println(cliente);
        System.out.println(cliente02);
    }
}
