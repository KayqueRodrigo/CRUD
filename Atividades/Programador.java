public class Programador extends Funcionario1{
    public void aumentaSalario(){
        setSalario(getSalario() * 1.8);
    }

    @Override
    public String toString() {
        return  "Nome do funcionario: " + getNome() + "\n" +
                "Cargo: " + "Programador" + "\n" +
                "Salário: " + getSalario() + "\n";
    }
}
