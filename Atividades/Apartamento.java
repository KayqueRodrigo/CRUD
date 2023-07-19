public class Apartamento extends Imovel{
    public Apartamento(double preco) {
        super(preco);
    }

    public double temPreco(){
        return getPreco() + 20.000;
    }
}
