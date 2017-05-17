/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelaralunos;

import static modelaralunos.ImprimirAlunos.imprimirAlunos;

public class ModelarAlunos {

    public static void main(String[] args) {
        ListaDeAlunos listadealuno = new ListaDeAlunos();
        Aluno alunos = new Aluno();

        
        listadealuno.alunos[0].nome = "yadson";
        listadealuno.alunos[0].idade = 18;
        listadealuno.alunos[0].curso = "IPI";
        listadealuno.alunos[0].periodo = 1;
        listadealuno.alunos[0].media[0] = 6.5;
        listadealuno.alunos[0].media[1] = 8.8;
        listadealuno.alunos[0].media[2] = 5.2;
        listadealuno.alunos[0].media[3] = 7.8;

        imprimirAlunos(listadealuno);

    }

}
