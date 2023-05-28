import java.util.Scanner;

public class Ano {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Verificaano ano = new Verificaano();

        System.out.println("Digite um ano: ");
        ano.setAno(leia.nextInt());

        ano.verificarAno();

    }
}
