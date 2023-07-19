public class Cilindro {
    private double pi = 3.14159;
    private double r;
    private double h;

    public Cilindro(double pi, double r, double h) {
        this.pi = pi;
        this.r = r;
        this.h = h;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }


}
