class  CalculadoraProfessor {

           public static void main(String[] args){

                     // constante do PI - 
                             float pi = 3.14f;
                  
                    // raio - informado pelo professor
                              float raio = 5.5f;

                    // area eh igual ao raio ao quadrado multiplicado por PI
                               float area = raio * raio * pi;
                               int areaSemCasasDecimais = (int) area;//essa pratca de conversão é chamada de chest
                               
                               System.out.println("Resultado: " + area);  
                               System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
  }
} 