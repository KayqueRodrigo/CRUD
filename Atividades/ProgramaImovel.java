public class ProgramaImovel {
    public static void main(String[] args) {

        Imovel[] imoveis = new Imovel[5];
        Apartamento ap = new Apartamento(350000.00);
        ap.setEndereco("Vila prudente");

        Velho vl = new Velho(350000.00);
        vl.setEndereco("São mateus");

        imoveis[0] = ap;
        imoveis[1] = vl;

        for (int i = 0; i < imoveis.length; i++) {
            if(imoveis[i] != null){
                System.out.println(imoveis[i].getEndereco());
                System.out.println(imoveis[i].getPreco());
                System.out.println(imoveis[i].temPreco());
            }

        }
    }
}
