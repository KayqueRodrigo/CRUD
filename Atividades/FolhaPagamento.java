import java.util.Scanner;
public class FolhaPagamento {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Funcionario ana = new Funcionario();

        System.out.println("Informe o nome: ");
        ana.setNome(leia.nextLine());

        System.out.println("informe o valor da hora: ");
        ana.setValorHora(leia.nextDouble());

        System.out.println("Informe as horas trabalhadas");
        ana.setHoraTrabalhada(leia.nextInt());


        System.out.println("Folha de pagamento: " + ana.getNome() );
        System.out.println(ana.getValorHora() + " X " + ana.getHoraTrabalhada() + " = " + ana.salarioBruto());
        System.out.println("Desconto: " + ana.descontos(ana.salarioBruto()));
        System.out.printf("Total devido: %f", ana.salarioBruto() + ana.descontos(ana.salarioBruto()));
    }

}

//Correção professor
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrestadorServico colaraborador = new PrestadorServico();
        System.out.println("Digite seu nome: ");
        colaraborador.setNome(sc.nextLine());
        System.out.println("Digite o valor por hora: ");
        colaraborador.setValorHora(sc.nextDouble());
        System.out.println("Digite o total de horas trabalhadas: ");
        colaraborador.setTotalHorasTrabalhadas(sc.nextInt());
        System.out.println("Digite o valor a descontar: ");
        colaraborador.setValorDesconto(sc.nextDouble());

        colaraborador.calcularFolhaPagamento();


    }
}
*/

