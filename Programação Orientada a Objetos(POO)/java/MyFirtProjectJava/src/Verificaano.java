public class Verificaano {
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void verificarAno(){
        if(getAno() % 4 == 0){
            System.out.println("Este ano é bissexto");
        } else {
            System.out.println("Este ano não é bissexto");
        }
    }





}
