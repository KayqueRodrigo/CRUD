programa {
  funcao inicio() {

    inteiro numero, positivo = 0, negativo = 0

    para(inteiro i = 0; i < 5; i++){

    escreva("Digite um n�mero: ")
    leia(numero)

    se(numero > 0){
      positivo = positivo + numero
    }senao{
      negativo++
    }
limpa()
    }
    escreva("A soma dos n�meros positivos �: ", positivo, "\n")
    escreva("A quantidade de n�meros negativos �: ", negativo)
  }
}
