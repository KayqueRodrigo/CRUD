import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica1>figurasGeometricas = new ArrayList();
        Scanner sc = new Scanner(System.in);

        double lado;
        double base;
        double altura;
        double raio;
        double valorKl;
        String materia;
        double pesofixo;
        double comprimento;
        int id = 0;
        int id2;
        int opcao1;
        int opcao2;
        int opcao3;
        double subtotal = 0;
        double desconto;

        do {

            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Pesquisar produto");
            System.out.println("3 - Alterar produto");
            System.out.println("4 - Excluir produto");
            System.out.println("0 - Sair");

            //Le a informação digitada no teclado
            opcao1 = sc.nextInt();

            switch (opcao1) {
                case 0: // sai do programa
                    break;
                case 1: // escolha para incluir um produto
                    System.out.println("Selecione o tipo de produto que deseja incluir ou digite '0' para VOLTAR");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Círculo");

                    opcao2 = sc.nextInt();

                    switch (opcao2) {
                        case 1: // incluir um quadrado

                            System.out.println("Informe a medida do lado: ");
                            lado = sc.nextDouble();
                            if (lado <= 0) {
                                System.out.println("valor inválido\n");
                                break;
                            }
                            ;
                            System.out.println("Informe a medida do comprimento: ");
                            comprimento = sc.nextDouble();
                            if (comprimento <= 0) {
                                System.out.println("valor inválido\n");
                                break;
                            }
                            ;
                            System.out.println("Informe o tipo de material: ");
                            materia = sc.next();
                            if (materia == null) {
                                System.out.println("dado inválido\n");
                                break;
                            }
                            ;
                            System.out.println("Informe o peso do produto: ");
                            pesofixo = sc.nextDouble();
                            if (pesofixo <= 0) {
                                System.out.println("valor inválido\n");
                                break;
                            }
                            ;
                            System.out.println("Informe o valor do kilo do produto: ");
                            valorKl = sc.nextDouble();
                            if (valorKl <= 0) {
                                System.out.println("valor inválido\n");
                                break;
                            }
                            ;
                            id++;
                            figurasGeometricas.add(new Quadrado1(valorKl, materia, pesofixo, comprimento, lado, id));
                            break;

                        case 2: // incluir um retângulo
                            System.out.println("Informe a medida da base: ");
                            base = sc.nextDouble();
                            if (base <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe a medida da altura: ");
                            altura = sc.nextDouble();
                            if (altura <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe a medida do comprimento: ");
                            comprimento = sc.nextDouble();
                            if (comprimento <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe o tipo de material: ");
                            materia = sc.next();
                            if (materia == null) {
                                System.out.println("dado inválido\n");
                                break;
                            };
                            System.out.println("Informe o peso do produto: ");
                            pesofixo = sc.nextDouble();
                            if (pesofixo <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe o valor do kilo do produto: ");
                            valorKl = sc.nextDouble();
                            if (valorKl <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            id++;
                            figurasGeometricas.add(new Retangulo1(valorKl, materia, pesofixo, comprimento, base, altura, id));
                            break;

                        case 3: // incluir um círculo
                            System.out.println("Informe a medida do raio: ");
                            raio = sc.nextDouble();
                            if (raio <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe a medida do comprimento: ");
                            comprimento = sc.nextDouble();
                            if (comprimento <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe o tipo de material: ");
                            materia = sc.next();
                            if (materia == null) {
                                System.out.println("dado inválido\n");
                                break;
                            };
                            System.out.println("Informe o peso do produto: ");
                            pesofixo = sc.nextDouble();
                            if (pesofixo <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            System.out.println("Informe o valor do kilo do produto: ");
                            valorKl = sc.nextDouble();
                            if (valorKl <= 0){
                                System.out.println("valor inválido\n");
                                break;
                            };
                            id++;
                            figurasGeometricas.add(new Circulo1(valorKl, materia, pesofixo, comprimento, raio, id));
                            break;

                        default: // sai do programa se digitar acima de 3
                            System.out.println("Opção Inválida");// tá com essa frase
                    }
                    break;

                case 2: // escolha de pesquisar imprime lista de todos os produtos incluídos
                    System.out.println("Digite a taxa de desconto: ");
                    desconto = sc.nextDouble();

                    System.out.println(figurasGeometricas);
                    System.out.println();

                    for (int i = 0; i < figurasGeometricas.size(); i++) {
                        subtotal += figurasGeometricas.get(i).custo();
                    }
                    System.out.printf("Subtotal: R$%.2f \n", subtotal);
                    System.out.printf("Desconto: R$%.2f \n", subtotal*desconto/100);
                    System.out.printf("Valor a pagar: R%.2f \n", subtotal*(100-desconto) / 100);
                    System.out.println();

                    break;

                case 3: // escolha de alterar um produto
                    System.out.println("Digite o número identificador");
                    id2 = sc.nextInt();
                    for (int i = 0; i < figurasGeometricas.size(); i++) {
                        if (id2 == figurasGeometricas.get(i).getId()) {
                            //se achar uma figura com o identificador digitado
                            System.out.println("Selecione o tipo de produto que deseja alterar");
                            System.out.println("1 - Quadrado");
                            System.out.println("2 - Retângulo");
                            System.out.println("3 - Círculo");
                            opcao2 = sc.nextInt();

                            if(opcao2 == 1 && figurasGeometricas.get(i).getClass() == Quadrado1.class){
                                //se a figura encontrada for um quadrado
                                System.out.println("1 - Alterar Lado");
                                System.out.println("2 - Alterar Comprimento");
                                System.out.println("3 - Alterar Valor do Kilo");
                                System.out.println("0 - Voltar");
                                opcao3 = sc.nextInt();

                                switch (opcao3) {
                                    case 1: // alterar lado do quadrado
                                        System.out.println("informe o novo lado");
                                        lado = sc.nextDouble();
                                        ((Quadrado1) figurasGeometricas.get(i)).setLado(lado);
                                        break;
                                    case 2: // alterar comprimento do quadrado
                                        System.out.println("informe o novo comprimento");
                                        comprimento = sc.nextDouble();
                                        ((Quadrado1) figurasGeometricas.get(i)).setComprimento(comprimento);
                                        break;
                                    case 3: // alterar valor do quilo do quadrado
                                        System.out.println("informe o novo valor do kilo");
                                        valorKl = sc.nextDouble();
                                        ((Quadrado1) figurasGeometricas.get(i)).setValorKl(valorKl);
                                        break;
                                    default: // sai do programa se digitar acima de 2
                                    {System.out.println("Opção Inválida");
                                        break;}
                                }

                            } else if(opcao2 == 2 && figurasGeometricas.get(i).getClass() == Retangulo1.class) {
                                //se a figura encontrada for um retângulo
                                System.out.println("1 - Alterar Base");
                                System.out.println("2 - Alterar Altura");
                                System.out.println("3 - Alterar Comprimento");
                                System.out.println("4 - Alterar Valor do Kilo");
                                System.out.println("0 - Voltar");
                                opcao3 = sc.nextInt();

                                switch (opcao3) {
                                    case 1: // alterar a base do retângulo
                                        System.out.println("informe a nova base");
                                        base = sc.nextDouble();
                                        ((Retangulo1) figurasGeometricas.get(i)).setBase(base);
                                        break;
                                    case 2: // alterar a altura do retângulo
                                        System.out.println("informe a nova altura");
                                        altura = sc.nextDouble();
                                        ((Retangulo1) figurasGeometricas.get(i)).setAltura(altura);
                                        break;
                                    case 3: // alterar comprimento do retângulo
                                        System.out.println("informe o novo comprimento");
                                        comprimento = sc.nextDouble();
                                        ((Retangulo1) figurasGeometricas.get(i)).setComprimento(comprimento);
                                        break;
                                    case 4: // alterar valor do quilo do retângulo
                                        System.out.println("informe o novo valor do kilo");
                                        valorKl = sc.nextDouble();
                                        ((Retangulo1) figurasGeometricas.get(i)).setValorKl(valorKl);
                                        break;
                                    default: // sai do programa se digitar acima de 3
                                    {   System.out.println("Opção Inválida");
                                        break;}
                                }
                            }else if(opcao2 == 3 && figurasGeometricas.get(i).getClass() == Circulo1.class){
                                //se a figura encontrada for um círculo
                                System.out.println("1 - Alterar Raio");
                                System.out.println("2 - Alterar Comprimento");
                                System.out.println("3 - Alterar Valor do Kilo");
                                System.out.println("0 - Voltar");
                                opcao3 = sc.nextInt();

                                switch (opcao3) {
                                    case 1: // alterar o raio do círculo
                                        System.out.println("informe o novo raio");
                                        raio = sc.nextDouble();
                                        ((Circulo1) figurasGeometricas.get(i)).setRaio(raio);
                                        break;
                                    case 2: // alterar o comprimento do círculo
                                        System.out.println("informe o novo comprimento");
                                        comprimento = sc.nextDouble();
                                        ((Circulo1) figurasGeometricas.get(i)).setComprimento(comprimento);
                                        break;
                                    case 3: // alterar valor do quilo do circulo
                                        System.out.println("informe o novo valor do kilo");
                                        valorKl = sc.nextDouble();
                                        ((Circulo1) figurasGeometricas.get(i)).setValorKl(valorKl);
                                        break;
                                    default: // sai do programa se digitar acima de 2
                                    {System.out.println("Opção Inválida");
                                        break;}
                                }
                            }
                        }
                    }
                    break;

                case 4: // escolha de excluir produto
                    System.out.println("Digite o número identificador");
                    id2 = sc.nextInt();
                    for (int i = 0; i < figurasGeometricas.size(); i++) {
                        if (id2 == figurasGeometricas.get(i).getId()) {
                            figurasGeometricas.remove(i);
                            System.out.println("O produto com número identificador " + id2 + " foi excluido\n");                        };
                    };
                    break;

                default:
                    System.out.println("Opção Inválida");
            }

        }while (opcao1 != 0);

    }

}