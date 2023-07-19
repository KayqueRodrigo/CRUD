public class SeguroDeVida implements Tributavel{
    private double saldo = 0;

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcularTributos() {
        return 0;
    }
}
