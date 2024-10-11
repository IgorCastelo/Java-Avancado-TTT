package Eexceptions.dominio;

public class LoginInvalidoEsception  extends Exception{
    public LoginInvalidoEsception() {
        super("Login Invalido");
    }

    public LoginInvalidoEsception(String message) {
        super(message);
    }
}
