public abstract class FiguraGeometrica1 {
    private double valorKl;
    private String materia;
    private double pesofixo;
    private double comprimento;
    private int id;

    public FiguraGeometrica1(double valorKl, String materia, double pesofixo, double comprimento, int id) {
        this.valorKl = valorKl;
        this.materia = materia;
        this.pesofixo = pesofixo;
        this.comprimento = comprimento;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getValorKl() {
        return valorKl;
    }

    public void setValorKl(double valorKl) {
        this.valorKl = valorKl;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getPesofixo() {
        return pesofixo;
    }

    public void setPesofixo(double pesofixo) {
        this.pesofixo = pesofixo;
    }
    public abstract double custo();
}