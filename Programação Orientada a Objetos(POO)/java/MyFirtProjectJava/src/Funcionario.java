public class Funcionario {
    private String nome;
    private double valorHora;
    private int horaTrabalhada;
    private double valorDescontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(int horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double getValorDescontos() {
        return valorDescontos;
    }

    public void setValorDescontos(double valorDescontos) {
        this.valorDescontos = valorDescontos;
    }

    public double salarioBruto(){
        return valorHora * horaTrabalhada;
    }

    public double descontos(double salarioBruto) {
        double salarioLiquido;
        salarioLiquido = salarioBruto - 80;
         return salarioBruto - salarioLiquido;
        }

}

//Correção professor
/*
public class PrestadorServico {
    private String nome;
    private double valorHora;
    private  int totalHorasTrabalhadas;
    private double valorDesconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHorasTrabalhadas() {
        return totalHorasTrabalhadas;
    }

    public void setTotalHorasTrabalhadas(int totalHorasTrabalhadas) {
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    */
/*
    Folha de pagamento: Pedro Silva
    172 horas x R$150.20 = R$25834.40
    Descontos: R$482.88
    Total devido: R$25351.5
     *//*

    public void calcularFolhaPagamento(){
        System.out.println("Folha de pagamento: "+getNome());
        System.out.println(getTotalHorasTrabalhadas() + " horas x R$"
                + getValorHora() + " = R$"
                + (getValorHora()*getTotalHorasTrabalhadas()));
        System.out.println("Descontos: "+getValorDesconto());
        System.out.println("Total devido: R$" + ((getValorHora()*getTotalHorasTrabalhadas())-getValorDesconto()));
    }
}

*/
