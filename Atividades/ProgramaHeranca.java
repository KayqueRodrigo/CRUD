public class ProgramaHeranca {
    public static void main(String[] args) {

        Cachorro1 toni = new Cachorro1();
        toni.setNome("toni");
        toni.setRaca("Bitbull");
        System.out.println("O " + toni.getNome() + ":");
        toni.late();

        Gato1 nina = new Gato1();
        nina.setNome("nina");
        toni.setRaca("N sei");
        nina.mia();
        System.out.println();

    }
}


//Correção professor
//Correção professor
//Aqui o professor adcionol o comportamento de polimorfismo
/*public class Programa {
    public static void main(String[] args) {

        Animal animais[] = new Animal[6];

        Animal animal = new Animal();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Bidu");
        cachorro1.setRaca("Boxe");
        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Lulu");
        cachorro2.setRaca("Sem raça definida");

        Gato gato1 = new Gato();
        gato1.setNome("Fubá");
        gato1.setRaca("Branco");
        Gato gato2 = new Gato();
        gato2.setNome("Mingau");
        gato2.setRaca("Blue");

        animais[0] = cachorro1;
        animais[1] = cachorro2;
        animais[2] = gato1;
        animais[3] = gato2;
        animais[4] = animal;

        for (int i = 0; i < animais.length; i++) {
            if (animais[i] != null) {
                System.out.println(animais[i].getNome());
                System.out.println(animais[i].getRaca());
                System.out.println(animais[i].caminha());
                System.out.println();
            }
        }

    }
}*/