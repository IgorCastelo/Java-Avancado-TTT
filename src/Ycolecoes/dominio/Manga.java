package Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {// É menos prefirivel utilizar a classe comparable do qu e a comparator po causa da sua necessidade de acoplamento na classe, deixando opouco flexivel a definição da regra de busca.
    private Long id;
    private String  nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"Id não pode ser null");
        Objects.requireNonNull(id,"Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manga manga = (Manga) o;

        if (!Objects.equals(id, manga.id)) return false;
        return Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Manga outroManga) {
       /* if (this.id<outroManga.getId()){
            return -1;
        }else if (this.id.equals(outroManga.getId())){
            return 0;
        }else {
            return 1;
        }
    }*/
        //return Double.compare(preco, outroManga.getPreco()); // se foi buscar por um valor que não é um walpper
        //return this.id.compareTo(outroManga.getId()); // é possivel chamar o comparTo pelo proproprio id por ele ser um wrapper
        return  this.nome.compareTo(outroManga.getNome());
    }


}
