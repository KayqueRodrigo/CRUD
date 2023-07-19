import java.util.Scanner;

public class ProgramaIngresso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;


        System.out.println("Informe 1 para ingresso Normal e 2 para ingresso Vip: " + "\n");
        escolha = sc.nextInt();
        switch (escolha){
            case 1:
                Normal normal = new Normal();
                normal.tipoIngrtesso();
                break;
            case 2:
                Vip vip = new Vip();
//Falta a msg que é um ingresso vip
                break;
            default:
                System.out.println("Valor invalido");
        }

        if (escolha == 2){

            System.out.println("Informe 1 camarote superior e 2 para camarote inferior: " + "\n");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    CamaroteSuperior superior = new CamaroteSuperior();
                    superior.getValorIngeresso();

                    break;
                case 2:
                   CamaroteInferior inferior = new CamaroteInferior();
                   inferior.getValorIngeresso();

                    break;
                default:
                    System.out.println("Valor invalido");
            }
        }





    }
}
