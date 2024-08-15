package sistemaGerenciamentoSemanario.dominio;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprimir(){

        System.out.println("----------");
        System.out.println("Professor: "+this.nome);
        if (seminarios==null)return;
        System.out.println("## Seminários cadastrados ##");
        for(Seminario seminario:seminarios){
        System.out.println(seminario.getTitulo());
        System.out.println(seminario.getLocal().getEndereco());
        if (seminario.getAlunos()==null||seminario.getAlunos().length ==0)continue;
            System.out.println("**Alunos**");
            for (Aluno aluno : seminario.getAlunos()) {//abrindo o vetor na estrutura for é possivel utilizar todas as funções da classe aluno
                System.out.println("Aluno: "+ aluno.getNome() + "idade: " + aluno.getIdade());
            }


        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}