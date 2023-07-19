public class Circulo1 extends FiguraGeometrica1 implements FigurasGeometricas{

    private double raio;

    public Circulo1(double valorKl, String materia, double pesofixo, double comprimento, int id) {
        super(valorKl, materia, pesofixo, comprimento, id);
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
    public double valorCusto() {
        return peso() * getValorKl();
    }
}
