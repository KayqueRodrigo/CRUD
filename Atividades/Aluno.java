import java.util.Scanner;

/*
Crie uma classe "Aluno" que tenha como atributos o nome, a nota do
aluno em uma prova, a média da turma e a disciplina, e como
método a verificação se o aluno foi aprovado ou não, considerando
uma nota de corte.
 */
public class Aluno {
    String nome;
    String diciplina;
    double media;
    Scanner leia = new Scanner(System.in);
    //
    double notas[] = new double[3];

    public double calcularMedia() {
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media / notas.length;
    }

    public void atribirNotas(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Entre com a " + (i+1) + "ª nota");
            notas[i] = leia.nextDouble();
        }
    }



}