public class Juros {
    private double capital;
    private double taxa;
    private int tempo;

    public Juros(double capital, double taxa, int tempo) {
        if (capital < 100){
            System.out.println("ERRO: Valor de capital minimo R$100");
        }else {
            this.capital = capital;
        }

        if(taxa > 0 && taxa <= 100){
            this.taxa = taxa;
        }else {
            System.out.println("ERRO: Digite uma taxa entre 1 e 100");
        }
        if (tempo > 0 && tempo <= 12){
            this.tempo = tempo;
        }else {
            System.out.println("ERRO: Digite um periodo de 1 a 12 meses");
        }

    }

    public double getCapital() {
            return capital;
    }

    public void setCapital(double capital) {
            if(capital <= 100){
                System.out.println("Digite um valor valido");
            }else {
                this.capital = capital;

            }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if(taxa > 0 && taxa <= 100){
            this.taxa = taxa;
        }else {
            System.out.println("ERRO");
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo > 0 && tempo <= 12){
            this.tempo = tempo;
        }else {
            System.out.println("ERRO");
        }
    }

    public void calculaJuros(){
        double calculo = (getCapital()*getTaxa()*getTempo()) / 100;
        if (calculo == 0){
            System.out.println(" ");
        }else {
            System.out.println(calculo);
        }
    }
}

//Correção prof 1
/*

public class JurosSimples {
    private double capital;
    private double taxa;
    private int tempo;

    public JurosSimples(double capital, double taxa, int tempo) {
        if (capital > 0 && taxa > 0 && tempo > 0 && tempo <= 12) {
            this.capital = capital;
            this.taxa = taxa;
            this.tempo = tempo;
        } else {
            System.out.println("ERRO: variáveis inválidas.");
        }
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        if (capital > 0) {
            this.capital = capital;
        } else {
            System.out.println("ERRO: Valor do capital inválido.");
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa > 0) {
            this.taxa = taxa;
        } else {
            System.out.println("ERRO: Taxa inválida.");
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo > 0 && tempo <= 12) {
            this.tempo = tempo;
        } else {
            System.out.println("ERRO: tempo inválido");
        }
    }

    public String getValorDosJuros() {
        double valorJuros = (getCapital() * getTaxa() * getTempo()) / 100;
        if (valorJuros > 0) {
            return ("" + valorJuros);
        } else {
            return "";
        }
    }
}
*/

//Correção 2

/*
* public class JurosSimples {
    private double capital;
    private double taxa;
    private int tempo;

    public JurosSimples(double capital, double taxa, int tempo) {
     setCapital(capital);
     setTaxa(taxa);
     setTempo(tempo);

    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        if (capital > 0) {
            this.capital = capital;
        } else {
            System.out.println("ERRO: Valor do capital inválido.");
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa > 0) {
            this.taxa = taxa;
        } else {
            System.out.println("ERRO: Taxa inválida.");
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo > 0 && tempo <= 12) {
            this.tempo = tempo;
        } else {
            System.out.println("ERRO: tempo inválido");
        }
    }

    public String getValorDosJuros() {
        double valorJuros = (getCapital() * getTaxa() * getTempo()) / 100;
        if (valorJuros > 0) {
            return ("" + valorJuros);
        } else {
            return "";
        }
    }
}
* */