public class Imovel {
    private String endereco;
    private double preco;

    public String getEndereco() {
        return endereco;
    }
//Costrutor
    public Imovel(double preco) {
        this.preco = preco;
    }
//metodos get e set
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    //outros metodos
    public double temPreco(){
        return getPreco();
    }
}
