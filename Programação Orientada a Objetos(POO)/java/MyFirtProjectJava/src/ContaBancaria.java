public class ContaBancaria {
    //Atributos
    int numeroConta;
    String nomeTitular;
    double saldo;
    int numeroAgencia;
    String tipoConta;

    //Metodo
    public void saque(double valor){
         this.saldo = this.saldo - valor;
    }
    public void deposito(double valor){
        this.saldo = this.saldo + valor;
    }
}
