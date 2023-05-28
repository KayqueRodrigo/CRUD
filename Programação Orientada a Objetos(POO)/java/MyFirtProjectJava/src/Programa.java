
public class Programa {
    public static void main(String[] args) {
        Retangulo retanguloUm = new Retangulo();
        retanguloUm.base = 15;
        retanguloUm.altura = 10;
        retanguloUm.material = "Madeira";
        retanguloUm.cor = "Marron";

        System.out.println("BASE: " + retanguloUm.base);
        System.out.println("ALTURA: " + retanguloUm.altura);

        System.out.println("AREA: " + retanguloUm.area());
        System.out.println("PERIMETRO: " + retanguloUm.perimetro());
    }
}

