programa {
  funcao inicio() {
    inteiro numero, adcao = 0, divisor = 0, media

    faca{

      escreva("Escreva um número: ")
      leia(numero)

      se(numero % 2 == 0 e numero != 0){
        adcao = numero + adcao
        divisor++
        media = adcao / divisor
      }senao{
        escreva("Números impar não será usado para calcular a media\n")
      }

      } enquanto(numero != 0)
      escreva("A media dos números par informados é: " + media)
    }
    
  }
}
