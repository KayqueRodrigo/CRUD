programa {
  funcao inicio() {
    cadeia matriz[5][5]

    para(inteiro linha = 0; linha < 5; linha++){
       para(inteiro coluna = 0 ; coluna < 5; coluna++){
       
       se(linha == coluna){
       matriz[linha][coluna] = "A"
     }senao se(linha == 3 e coluna == 2){
      matriz[linha][coluna] = "C"
     }senao{
      matriz[linha][coluna] = "B"
     }
    }
   }

  para(inteiro linha = 0; linha < 5; linha++){
    para(inteiro coluna = 0; coluna < 5; coluna++){
      escreva("[" + matriz[linha][coluna] + "]")
    }
    escreva("\n")
  }

   




  }
}
