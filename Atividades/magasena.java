class MagaSena {
    public static void main(String[] args) {


        System.out.println("////\\\\" + "***** TABELA DE NÚMEROS *******" + "///////\\\\\\");
        System.out.println();


        //Trabalhando na vizualização da cartela com os numeros que podem ser sorteados
        //Declaração das variavel e matriz
        int valoresCartela = 1;
        int[][] cartela = new int[6][10];
        //Preenchendo a matriz
        for (int linhas = 0; linhas < cartela.length; linhas++ ){
            for (int colunas = 0; colunas < cartela[linhas].length; colunas++){
                cartela[linhas][colunas] = valoresCartela++;
            }
        }
        //Imprimindo na tela a tabela
        for (int linhas = 0; linhas < cartela.length; linhas++ ){
            for (int colunas = 0; colunas < cartela[linhas].length; colunas++){
                System.out.printf("[%d]", cartela[linhas][colunas] );
                //System.out.print("[" + cartela[linhas][colunas] + "]");
            }
        }


        System.out.println();
        System.out.println("////\\\\" + "******* NÚMEROS SORTEADOS ******" + "///////\\\\\\");
        System.out.println();


        //Desenvolvendo o sorteio
        //Não deve haver números repetidos e zero e maior que 60
        //variavel e vetor
        int[] numsorteado = new int[6];
        int contador = 0;
        //Preenchendo o vetor com numeros sorteados
     for(int i = 0; i < numsorteado.length; i++){
            numsorteado[i] = (int)(Math.random() * 60 + 1);
            //System.out.print("[" + numsorteado[i] + "]");
        }
     /*aqui temos dois laços for. Um "para" parar o index e o segundo para percurrer o vetor. Dentro do segundo "para"
     temos uma condicional "se", onde compara o index do primeiro "para" que esta fixado, com o do segundo "para" que esta
     percurrendo o vetor e nessa é comparado se o valor desses index são iguais e se o ingex são iguais é disconsiderado.
     Entrando no "se" segnifica que o valor é repetido, então é realizado um outro sorteio.
     Caso contrario entra no "se não" que contabiliza uma iteração no while.
     Foi usado o valor 36 no "faça" por que temos 36 comparações sem numeros
     repedidos(que controla isso para nos é a variavel contador) para ser realizadas.
     */
     while (contador < 36)

        for(int fixa = 0; fixa < numsorteado.length; fixa++){
            for(int i = 0; i < numsorteado.length; i++){

                if(numsorteado[fixa] == numsorteado[i] && fixa != i){
                    numsorteado[i] = (int)(Math.random() * 60 + 1);
                }else{
                    contador++;
                }
            }
            System.out.println(fixa);
        }
     //Imprime os valores sorteados e verificados
        for(int i = 0; i < numsorteado.length; i++) {
            System.out.print("[" + numsorteado[i] + "]");
        }


        System.out.println();
        System.out.println();
        System.out.println("////\\\\" + "****** TESTE ********" + "///////\\\\\\");
        System.out.println();


        //Foi feito esse teste para comparar os resultados de um sorteio que não passa por conferecia para um que passa
        int[] teste = new int[6];

        for (int i = 0; i < teste.length ; i++) {
            numsorteado[i] = (int)(Math.random() * 60 + 1);
            System.out.print("[" + numsorteado[i] + "]");
            System.out.println(i);

        }



    }
 }












/*
Revisão de matriz

         //Boas praticas: nomes de matriz ou vetor no plural
        //declaração de um array / instanciação do objeto matriz de 30 linhas e 4 colunas
        double[][] notasAlunos = new double[3][4];

        //preenchendo a primeira linha e as quatro colunas
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;
        //preenchendo a segunda linha e as quatro colunas
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        //Imprimindo uma matriz

        for(int linha = 0; linha < notasAlunos.length; linha++){
            for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++){
                System.out.print("[" + notasAlunos[linha][coluna] + "]");
            }
            System.out.println();
        }


*/
