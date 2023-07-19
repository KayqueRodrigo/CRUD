public class ProgramaFGeometrica {
    public static void main(String[] args) {

        FormaGeometrica circulo1 = new Circulo();
        ((Circulo) circulo1).setRaio(8);
        ((Circulo) circulo1).setComprimento(6);

        FormaGeometrica quadrado1 = new Quadrado();
        ((Quadrado) quadrado1).setLado(10);
        ((Quadrado) quadrado1).setComprimento(3);

        System.out.println("CIRCULO");
        System.out.printf("AREA %.2f M² \n", circulo1.calcularArea());
        System.out.printf("PERIMETRO %.2f M \n", circulo1.calcularPerimetro());
        System.out.printf("VOLUME %.2f M³ ", circulo1.calcularVolume());

        System.out.println("\n");

        System.out.printf("QUADRADO \n");
        System.out.printf("AREA %.2f M \n", quadrado1.calcularArea());
        System.out.printf("PERIMETRO %.2f M \n", quadrado1.calcularPerimetro());
        System.out.printf("VOLUME %.2f M³ ", circulo1.calcularVolume());



    }
}
