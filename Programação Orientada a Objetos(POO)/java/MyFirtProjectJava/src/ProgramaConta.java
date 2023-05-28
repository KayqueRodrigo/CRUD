public class ProgramaConta {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.saldo = 1000;
        conta.numeroConta = 101010;
        conta.numeroAgencia = 1;
        conta.nomeTitular = "Alfredo de ferraz";
        conta.tipoConta = "CC";

        System.out.println("Nome do Titular: " + conta.nomeTitular);
        System.out.println("Nº Agência: " + conta.numeroAgencia);
        System.out.println("Nº Conta: " + conta.numeroConta);
        System.out.println("Tipo conta: " + conta.tipoConta);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println("Saldo com o deposito de 100 reais: ");
        conta.deposito(100);
        System.out.println("Saldo com um saque de 200 reais: ");
        conta.saque(200);
    }
}
