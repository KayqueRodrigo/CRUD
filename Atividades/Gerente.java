public class Gerente extends Funcionario1{
    public void aumentaSalario(){
        setSalario(getSalario() * 1.4);
    }

    @Override
    public String toString() {
        return  "Nome do funcionario: " + getNome() + "\n" +
                "Cargo: " + "Gerente" + "\n" +
                "Salário: " + getSalario();
    }
}
