public class ProgramaAnimal {
    public static void main(String[] args) {

        Animal pet = new Animal();

        pet.nome = "Mayque";
        pet.idade = 10;
        pet.habitat = "lar";
        pet.especie = "cachorro";

        System.out.println("O cachorro faz: ");
        pet.son(pet.especie);

    }
}
