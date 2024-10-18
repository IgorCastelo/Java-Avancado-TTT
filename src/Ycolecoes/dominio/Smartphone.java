package Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //reflexivo: x.equals(x) deve ser true para tudo que for diferente de null
    //Simetrico:  para x  e y diferentes de null,  se x.equals(y), logo y.equals(x) is true
    //transitividade: Para x,y,z diferentes de null, se x.equals(y)  == true , e x.equals(z)==true, então y.equals(z)==true
    // consistente x.equals(y) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj.getClass() != this.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "seialNumber='" + serialNumber + '\'' +
                ", modelo='" + marca + '\'' +
                '}';
    }
}
