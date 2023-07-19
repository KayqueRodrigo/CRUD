public class Retangulo1 extends FiguraGeometrica1 implements FigurasGeometricas{

    private double base;
    private double altura;

    public Retangulo1(double valorKl, String materia, double pesofixo, double comprimento, int id) {
        super(valorKl, materia, pesofixo, comprimento, id);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double volume() {
        return getComprimento() * area();
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
