/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelaralunos;

/**
 *
 * @author Isabelly
 */
public class ImprimirAlunos {

    public static void imprimirAlunos(ListaDeAlunos l) {
        for (int i = 0; i < l.alunos.length; i++) {
            if (l.alunos[i] != null) {
                Aluno aluno = new Aluno();
                System.out.println("Nome:" + aluno.nome);
                System.out.println("Idade:" + aluno.idade);
                System.out.println("Curso:" + aluno.curso);
                aluno.media[0] = (aluno.media[0] + aluno.media[1] + aluno.media[2] + aluno.media[3]) / 4;
                System.out.println("Media:" + aluno.media[0]);
                if (aluno.media[0] >= 6) {
                    System.out.println("Situação: Aprovado");
                } else {
                    System.out.println("Situação: Reprovado");
                }

                l.alunos[i] = aluno;
            } else {
                break;
            }
        }
    }
}
