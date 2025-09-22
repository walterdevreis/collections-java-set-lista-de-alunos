package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> listaDeAlunos;

    public GerenciadorAlunos(){
        this.listaDeAlunos = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double media){
        this.listaDeAlunos.add(new Aluno(matricula, nome, media));
    }

   public void exibirAlunos(){
        for (Aluno aluno : listaDeAlunos){
            System.out.println(aluno);
        }
   }

    public void exibirAlunosPorNome(){
        Set<Aluno> listaOrdenadaPorNome = new TreeSet<>(listaDeAlunos);
        if (!listaDeAlunos.isEmpty()){
            for (Aluno aluno : listaOrdenadaPorNome){
                System.out.println(aluno);
            }
        }
        else {
            throw new RuntimeException("A lista de alunos está vazia!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> listaOrdenadaPorNota = new TreeSet<>(new CompararPorNota());
        if (!listaDeAlunos.isEmpty()){
            listaOrdenadaPorNota.addAll(listaDeAlunos);
            for (Aluno aluno : listaOrdenadaPorNota){
                System.out.println(aluno);
            }
        }
        else {
            throw new RuntimeException("A lista de alunos está vazia!");
        }
    }

    public void removerAluno(long matricula){
        Aluno aluno = null;
        if (!listaDeAlunos.isEmpty()){
            for (Aluno a : listaDeAlunos){
                if (a.getMatricula() == matricula){
                    aluno = a;
                    break;
                }
            }
            listaDeAlunos.remove(aluno);
        }
        else {
            throw new RuntimeException("Aluno não encontrado ou lista de alunos vazia!");
        }
    }
}
