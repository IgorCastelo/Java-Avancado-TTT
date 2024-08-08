package Associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public Escola(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        System.out.println("Escola: " + this.nome);
        System.out.println("Profesores: ");
        if (professores==null)return;
        for (Professor professor : professores) {
            System.out.println("- "+professor.getNome());
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
