public class Circulo implements FormaGeometrica{
    private double raio;

    private double comprimento;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
//Metodo
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularVolume() {
        return calcularArea() * getComprimento();
    }
}
