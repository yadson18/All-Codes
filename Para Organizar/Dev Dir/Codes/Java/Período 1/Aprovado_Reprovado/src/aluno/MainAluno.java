package aluno;

import static aluno.imprimirAluno.ImprimirAluno;

public class MainAluno {

    public static void main(String[] args) {
        Materia materia = new Materia();
        

       
            Aluno aluno = new Aluno();
            aluno.nome = "Yadson";
            aluno.idade = 18;
            aluno.curso = "IPI";
            aluno.periodo = 1;
            aluno.media[0] = 8.8;
            aluno.media[1] = 6.2;
            aluno.media[2] = 4.8;
            aluno.media[3] = 7.1;

            materia.aluno[0] = aluno;

            Aluno aluno = new Aluno();

            aluno.nome = "Izabelly";
            aluno.idade = 16;
            aluno.curso = "IPI";
            aluno.periodo = 1;
            aluno.media[0] = 8.8;
            aluno.media[1] = 6.2;
            aluno.media[2] = 4.8;
            aluno.media[3] = 7.1;

            materia.aluno[1] = aluno;

        

        ImprimirAluno(aluno, materia);

    }

}
