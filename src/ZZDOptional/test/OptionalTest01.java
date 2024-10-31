package ZZDOptional.test;

import java.util.Optional;

public class OptionalTest01 {
        public static void main(String[] args) {
            String s = "Increva-se!";
            // String s = "1";
            Optional<Integer> numero = converteEmNumero(s);
            numero.ifPresent(n -> System.out.println(n));
            numero.orElse(2);//joga um valor default
            System.out.println(numero);
            //numero.orElseGet(()-> {return operaçãoPesada();});//executa uma funçãoqualquer caso o optnal seja null
            numero.orElseThrow(()-> new NullPointerException("Valor vazio"));
        }

        public static Optional<Integer> converteEmNumero(String numeroStr) {
            try {
                Integer integer = Integer.valueOf(numeroStr);
                return Optional.of(integer);
            } catch (Exception e) {
                return Optional.empty();
            }
        }
    }
