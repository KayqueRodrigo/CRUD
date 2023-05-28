public class Retangulo {
    //Atributos da classe
    double altura;
    double base;
    String cor;
    String material;

    // Construtor o objeto so será criado se tiver esses dois atributos base e altura e declaados já na instanciação
  /*  public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
}*/
    //Metodo da classe
    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * altura + 2 * base;
    }
}
