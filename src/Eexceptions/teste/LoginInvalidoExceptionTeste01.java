package Eexceptions.teste;

import Eexceptions.dominio.LoginInvalidoEsception;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoEsception e) {
            e.printStackTrace();
        }

    }
    public static  void logar() throws LoginInvalidoEsception {
        Scanner scanner=new Scanner(System.in);
        String UserNameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Digite onome de usuário: ");
        String userNameDigitado = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senhadigitada = scanner.nextLine();
        if (!userNameDigitado.equals(UserNameDB)||!senhaDB.equals(senhadigitada)){
            throw new LoginInvalidoEsception("Usuario ou senha invalido");
        }
        System.out.println("Usuario logado com sucesso!");
    }
}
