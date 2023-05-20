programa {
  funcao inicio() {
    inteiro matriz [4][4], produto [4][4]
    

    para(inteiro linha = 0; linha < 4; linha++){
      para(inteiro coluna = 0; coluna < 4; coluna++){
        leia(matriz[linha][coluna])
      }
    }
    para(inteiro linha = 0; linha < 4; linha++){
      para(inteiro coluna = 0; coluna < 4; coluna++){
         produto[linha][coluna] = matriz[linha][coluna] * matriz[linha][coluna]
      escreva("[" + produto[linha][coluna] + "]")
      }
      escreva("\n")
    }
  }
}
