programa {
  funcao inicio() {
  
    inteiro numero, contador=0, soma = 0

    faca{
      escreva("entre com um numero: ")
        leia(numero)
       
        se(numero>=1 e numero<=100){
          soma += numero
           contador++

        }senao{
          escreva("Entre com valor valido")
        }
    se(contador == 2){
      numero = 0
    }

    }enquanto(numero != 0)
   

escreva(soma)
   

  }
}
