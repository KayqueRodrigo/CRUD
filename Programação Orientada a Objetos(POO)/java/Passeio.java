public class Passeio {

          public static void main(String[] args) {
                     Pessoa p1 = new Pessoa();
                     p1.nome = "kayque";

                     p1.cachorro = new Cachorro();
                     
                     p1.cachorro.nome = "Mayque";
                     p1.cachorro.idade = 10;
                     p1.cachorro.raca = "Shih-tzu";
                     p1.cachorro.sexo = 'M';

                     Caminhada c = new Caminhada();
                     c.andar(p1);

}

}