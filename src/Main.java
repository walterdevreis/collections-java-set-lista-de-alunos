import entities.Aluno;

import java.security.AlgorithmConstraints;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Aluno aluno = new Aluno(1111, "Amanda", 7.0);

        System.out.println(aluno);
    }
}