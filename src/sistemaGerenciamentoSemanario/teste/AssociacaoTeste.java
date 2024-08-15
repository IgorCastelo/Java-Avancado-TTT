package sistemaGerenciamentoSemanario.teste;

import sistemaGerenciamentoSemanario.dominio.Aluno;
import sistemaGerenciamentoSemanario.dominio.Local;
import sistemaGerenciamentoSemanario.dominio.Professor;
import sistemaGerenciamentoSemanario.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Ruffy ",17);
        Aluno aluno2 = new Aluno("Zoro ",21);

        Professor professor = new Professor("Barba Branca", "Pirata");

        Aluno [] alunosParaSeminario = {aluno,aluno2};

        Seminario seminario= new Seminario("Onde encontrar o One Piece",local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprimir();


    }
}