import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
public class ProgramaPoliformismo {
    public static void main(String[] args) {
        ArrayList<Funcionario1> funcionarios = new ArrayList<>();
        NumberFormat moeda = NumberFormat.getCurrencyInstance();

        Gerente gerente = new Gerente();
        gerente.setNome("Davi mendes");
        gerente.setSalario(7800.00);
        gerente.aumentaSalario();
        funcionarios.add(gerente);

        Programador programador = new Programador();
        programador.setNome("kayque rodrigo");
        programador.setSalario(10000.00);
        programador.aumentaSalario();
        funcionarios.add(programador);

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).toString());
        }

    }
}
