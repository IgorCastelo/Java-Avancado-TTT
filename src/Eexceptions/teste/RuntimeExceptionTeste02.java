package Eexceptions.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        System.out.println(divisao(2,0));
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser igua a zero");
        }
        return a / b;
    }
}
