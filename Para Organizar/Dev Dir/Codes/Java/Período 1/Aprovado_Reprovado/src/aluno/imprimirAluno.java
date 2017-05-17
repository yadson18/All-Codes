/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author Isabelly
 */
public class imprimirAluno {

    public static void ImprimirAluno(Aluno a, Materia m) {

        for (int i = 0; i < m.aluno.length; i++) {
            if (m.aluno[i] != null) {
                System.out.println("Nome: " + m.aluno[i].nome);
                System.out.println("Idade: " + m.aluno[i].idade);
                System.out.println("Curso: " + m.aluno[i].curso);
                System.out.println("Periodo: " + m.aluno[i].periodo);
                m.aluno[i].media[i] = (m.aluno[i].media[i] + m.aluno[i].media[i]) / 4;
                System.out.println("Media: " + m.aluno[i].media[i]);
                if (m.aluno[i].media[i] > 6) {
                    System.out.println("Aprovado" + "\n");
                } else {
                    System.out.println("Reprovado" + "\n");
                }
            } else {
                break;
            }
        }

    }
}
