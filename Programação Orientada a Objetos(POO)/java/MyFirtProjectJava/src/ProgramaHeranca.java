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
    }
}
