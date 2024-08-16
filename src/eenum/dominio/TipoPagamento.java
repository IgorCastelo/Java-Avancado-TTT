package eenum.dominio;

public enum TipoPagamento{
        CREDITO{
            @Override
            public double calculardesconto(double valor) {
                return valor * 0.1;
            }
        }, DEBITO{
        @Override
        public double calculardesconto(double valor) {
            return valor*0.05;
        }
    };

        public abstract double calculardesconto(double valor);

    }