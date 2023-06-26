public class Retangulo1 extends FiguraGeometrica1 implements FigurasGeometricas{

    private double base;
    private double altura;

    public Retangulo1(double valorKl, String materia, double pesofixo, double comprimento,
                      double base, double altura, int id) {
        super(valorKl, materia, pesofixo, comprimento, id);
        setBase(base);
        setAltura(altura);
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
    public double custo() {
        return peso() * getValorKl();
    }

    @Override
    public String toString() {
        return  "\nRetangulo {" +
                "\nIdentificador: " + getId() +
                "\nArea: " + area() +
                "\nVolume: " + volume() +
                "\nMaterial: " + getMateria() +
                "\nPeso Total: " + peso() +
                "\nCusto do produto: " + custo() + "}" +
                "\n";
    }
}