/*
Faça um programa que leia uma matriz [5,5] de inteiros e
verifique se existem elementos repetidos
*/

programa {
  funcao inicio() {
    inteiro matriz[3][2]

    para(inteiro linha = 0; linha < 3; linha++){
      para(inteiro coluna = 0; coluna < 2;coluna++){
        leia(matriz[linha][coluna])
      }
    }






  para(inteiro fixaL = 0; fixaL < 3; fixaL++){
  para(inteiro fixaC = 0; fixaC < 2; fixaC++){

  para(inteiro linha = 0; linha < 3; linha++){
    para(inteiro coluna = 0; coluna < 2; coluna++){

  
 
  se(matriz[fixaL][fixaC] == matriz[linha][coluna] e fixaL != linha e fixaC != coluna){
  escreva("O número repetido é:" + matriz[linha][coluna])
  }

  }
  }
  escreva("\n")
  } 
}












  }
}
