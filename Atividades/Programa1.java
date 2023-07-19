import java.util.ArrayList;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica1>figurasGeometricas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int opcao1 = 0;
        int opcao2 = 0;

        do {


            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Pesquisar produto");
            System.out.println("3 - Alterar produto");
            System.out.println("4 - Deletar produto");
            System.out.println("0 - Sair");

            //Le a informação digitada no teclado
            opcao1 = sc.nextInt();

            switch (opcao1) {
                case 0:
                    break;
                case 1:
                    System.out.println("Selecione o produto");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Círculo");

                    opcao2 = sc.nextInt();

                    switch (opcao2) {
                        case 1:
                            double lado;
                            double valorKl;
                            String materia;
                            double pesofixo;
                            double comprimento;
                            int id;
                            System.out.println("Informe a medida do lado: ");
                            lado = sc.nextDouble();
                            System.out.println("Informe a medida do comprimento: ");
                            comprimento = sc.nextDouble();
                            System.out.println("Informe o tipo de material: ");
                            sc.nextLine();
                            materia = sc.nextLine();
                            System.out.println("Informe o peso do produto: ");
                            pesofixo = sc.nextDouble();
                            System.out.println("Informe o valor do kilo do produto: ");
                            valorKl = sc.nextDouble();
                            System.out.println("Informe o numero identificador: ");
                            id = sc.nextInt();
                            //figurasGeometricas.add(new Quadrado1(valorKl, materia, pesofixo, comprimento, lado, id));
                            break;
                        case 2:
                            System.out.println(opcao2);
                            break;
                        case 3:
                            System.out.println(opcao2);
                            break;
                        default:
                            System.out.println("Selecione uma opção válida");
                    }
                    break;
                case 2:
                    System.out.println(figurasGeometricas);
                /*System.out.println("Selecione o produto");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Retângulo");
                System.out.println("3 - Círculo");*/
                    break;
                case 3:
                    System.out.println("Selecione o produto");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Círculo");
                    break;
                case 4:
                    System.out.println("Digite o número identificador");
                    int a = sc.nextInt();



                    /*System.out.println("Selecione o produto");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Círculo");*/
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
        }while (opcao1 != 0);


    }
}
