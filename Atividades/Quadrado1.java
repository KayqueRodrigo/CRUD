public class Quadrado1 extends FiguraGeometrica1 implements FigurasGeometricas{
    private double lado;

    public Quadrado1(double Valorkl, String materia, double pesofixo, double comprimento, double lado, int id) {
        super(Valorkl, materia, pesofixo, comprimento, id);
        setLado(lado);
    }

    @Override
    public String toString() {
        return "Quadrado1{" + "Identificador: " + getId() +
                "\nlado: " + lado +
                "\nComprimento: " + getComprimento() +
                "\nMaterial: " + getMateria() +
                "\nPeso: " + getPesofixo() +
                "\nValor do quilo: " + getValorKl() +
                '}' + "\n";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public double volume() {
        return getLado() * area();
    }

    @Override
    public double peso() {
        return volume() * getPesofixo();
    }

    @Override
    public double valorCusto() {
        return peso() * getValorKl();
    }
}
