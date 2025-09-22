import entities.Aluno;
import entities.GerenciadorAlunos;

import java.security.AlgorithmConstraints;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno(123456L,"João",  7.5);
        gerenciadorAlunos.adicionarAluno(123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno(123458L, "Carlos", 5.0);
        gerenciadorAlunos.adicionarAluno(123459L, "Ana", 6.8);

        System.out.println();
        System.out.println("Exibindo todos os alunos no gerenciador");
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        System.out.println();
        System.out.println("Removendo um aluno com matrícula inválida e outro pelo número de matrícula");
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        gerenciadorAlunos.exibirAlunos();

        System.out.println();
        System.out.println("Exibindo alunos ordenados por nome");
        gerenciadorAlunos.exibirAlunosPorNome();

        System.out.println();
        System.out.println("Exibindo alunos ordenados por nota");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}