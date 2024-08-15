package modificadorFinal.teste;

import modificadorFinal.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("kuririn");
        System.out.println(carro.COMPRADOR);
        System.out.println(carro);
    }
}
