public class Animal {
    //Atributos
    String nome;
    int idade;
    String especie;
    String habitat;

    public void son(String especie){
        if(this.especie == "cachorro"){
            System.out.println("auau");
        }else {
            if(this.especie == "gato"){
                System.out.println("minhau");
            }else {
                System.out.println("Não temos este son");
            }
        }
    }


}
