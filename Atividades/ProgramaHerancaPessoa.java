public class ProgramaHerancaPessoa {
    public static void main(String[] args) {

        Pessoa1 [] pessoas = new Pessoa1[3];

        Rica rica1 = new Rica();
        rica1.setNome("Ana");
        rica1.setIdade(22);
        rica1.setDinheiro(1000000.00);

        Pobre pobre1 = new Pobre();
        pobre1.setNome("Maria");
        pobre1.setIdade(67);

        Miseravel meseravel1 = new Miseravel();
        meseravel1.setNome("antonio");
        meseravel1.setIdade(74);

        pessoas[0] = rica1;
        pessoas[1] = pobre1;
        pessoas[2] = meseravel1;


       /* for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas.);

        }*/


    }
}
