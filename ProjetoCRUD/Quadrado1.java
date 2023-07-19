public class Quadrado1 extends FiguraGeometrica1 implements FigurasGeometricas{
    private double lado;

    public Quadrado1(double valorKl, String materia, double pesofixo, double comprimento, double lado, int id) {
        super(valorKl, materia, pesofixo, comprimento, id);
        setLado(lado);
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
        return  "\nQuadrado {" +
                "\nIdentificador: " + getId() +
                "\nArea: " + area() +
                "\nVolume: " + volume() +
                "\nMaterial: " + getMateria() +
                "\nPeso Total: " + peso() +
                "\nCusto do produto: " + custo() + "}" +
                "\n";
        //        verificar como fazer para imprimir 2 casas
        //        System.out.printf("AREA: %.2f m² \n", circulo1.area());
        //        System.out.printf("PERIMETRO: %.2f m", circulo1.perimetro());
    }
}