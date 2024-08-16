package eenum.teste;

import eenum.dominio.Cliente;
import eenum.dominio.TIpoCliente;
import eenum.dominio.TipoPagamento;

import java.sql.SQLOutput;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TIpoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Ryu", TIpoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente03 = new Cliente("Shiriu", TIpoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);
        Cliente cliente04 = new Cliente("shun lin", TIpoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);

        System.out.println(TipoPagamento.DEBITO.calculardesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculardesconto(100));
        TIpoCliente tipoCliente = TIpoCliente.valueOf(("PESSOA_FISICA"));
        System.out.println(tipoCliente.getNomeRelatorio());
        TIpoCliente tipoCliente2= TIpoCliente.tipoclientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
