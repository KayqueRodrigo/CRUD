import java.util.Scanner;

public class ProgramaJuros {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);


        System.out.println("Digite o valor do capital: ");
        double capital = le.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        double taxa = le.nextDouble();
        System.out.println("Digite o periodo da aplicação: ");
        int tempo = le.nextInt();

        Juros ju = new Juros(capital, taxa, tempo);

        ju.calculaJuros();

    }
}
//Correção professor 1
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do CAPITAL:");
        double capital = sc.nextDouble();
        System.out.println("Informe o valor da TAXA:");
        double taxa = sc.nextDouble();
        System.out.println("Informe o TEMPO:");
        int tempo = sc.nextInt();

        JurosSimples jurosSimples = new JurosSimples(capital, taxa, tempo);

        System.out.printf("VALOR DOS JUROS: " + jurosSimples.getValorDosJuros());


    }

}*/

//correção 2

/*
*
* */
