package Ycolecoes.dominio;

public class Smartphone {
    private String seialNumber;
    private String modelo;

    public Smartphone(String seialNumber, String modelo) {
        this.seialNumber = seialNumber;
        this.modelo = modelo;
    }

    public String getSeialNumber() {
        return seialNumber;
    }

    public void setSeialNumber(String seialNumber) {
        this.seialNumber = seialNumber;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "seialNumber='" + seialNumber + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
