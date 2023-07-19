import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circulo1 extends FiguraGeometrica1 implements FigurasGeometricas{

    private double raio;

    public Circulo1(double valorKl, String materia, double pesofixo, double comprimento, double raio, int id) {
        super(valorKl, materia, pesofixo, comprimento, id);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public double volume() {
        return area() * getComprimento();
    }

    @Override
    public double peso() {
        return volume() * getPesofixo();
    }

    @Override
    public double custo() {
        return peso() * getValorKl();
    }

    public String toString() {
        DecimalFormat formatado = new DecimalFormat("0.00");
        return  "\nCirculo {" +
                "\nIdentificador: " + getId() +
                "\nArea: " + formatado.format(area()) +
                "\nVolume: " + formatado.format(volume() )+
                "\nMaterial: " + getMateria() +
                "\nPeso Total: " + formatado.format(peso() )+
                "\nCusto do produto: " + NumberFormat.getCurrencyInstance().format(custo()) + "}" +
                "\n";
//        return  "\nCirculo {" +
//                "\nIdentificador: " + getId() +
//                "\nArea: " + area() +
//                "\nVolume: " + volume() +
//                "\nMaterial: " + getMateria() +
//                "\nPeso Total: " + peso()+
//                "\nCusto do produto: " + custo() + "}" +
//                "\n";

    }
}