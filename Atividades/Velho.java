public class Velho extends Imovel{
    public Velho(double preco) {
        super(preco);
    }
    public double temPreco(){
        return getPreco() - 20.000;
    }
}
