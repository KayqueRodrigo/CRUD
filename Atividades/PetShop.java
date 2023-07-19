
public class PetShop {
    public static void main (String[] args){

        Cachorro toto = new Cachorro();
        toto.nome = "Mayque";
        toto.idade = 10;
        toto.raca = "Shit shu";
        toto.sexo = 'M';

        Cachorro dog = new Cachorro();
        dog.nome = "Dog";
        dog.idade = 5;
        dog.raca = "Pitbull";
        dog.sexo = 'F';

        System.out.println("Nome: " + toto.nome);
        System.out.println("Idade: " + toto.idade);
        System.out.println("Raça: " + toto.raca);
        System.out.println("Sexo: " + toto.sexo);

        System.out.println();

        System.out.println("NOME: " + dog.nome);
        System.out.println("IDADE: " + dog.idade);
        System.out.println("RAÇA: " + dog.raca);
        System.out.println("SEXO: " + dog.sexo);


    }
}

