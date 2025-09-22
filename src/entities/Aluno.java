package entities;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private long matricula;
    private String nome;
    private double media;

    public Aluno(){}

    public Aluno(long matricula, String nome, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.getNome().compareToIgnoreCase(aluno.getNome());
    }
}

class CompararPorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
