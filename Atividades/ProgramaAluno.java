import java.util.Scanner;
//Cod com erro de calculo
public class ProgramaAluno {

    public static void main(String[] args) {
        Turma java = new Turma();

        Aluno alunoUm = new Aluno();
        alunoUm.nome = "Leandro";
        alunoUm.diciplina = "Java";
        alunoUm.atribirNotas();

        Aluno alunoDois = new Aluno();
        alunoDois.nome = "Otavio";
        alunoDois.diciplina = "Java";
        alunoDois.atribirNotas();

        Aluno alunoTres = new Aluno();
        alunoTres.nome = "Neide";
        alunoTres.diciplina = "Java";
        alunoTres.atribirNotas();


        System.out.printf("MEDIA do aluno 1: %.2f \n", alunoUm.calcularMedia());
        System.out.printf("MEDIA do aluno 2: %.2f \n", alunoDois.calcularMedia());
        System.out.printf("MEDIA do aluno 3: %.2f \n", alunoTres.calcularMedia());

        java.turmas[0] = alunoUm;
        java.turmas[1] = alunoDois;
        java.turmas[2] = alunoTres;

        System.out.printf("A MEDIA DA TURMA FOI: %.2f \n", java.calcularMediaDaTurma());


    }
}