programa {
  funcao inicio() {
    real peso, altura, imc

    escreva("Qual � o seu peso? ")
    leia(peso)

    escreva("Qual � a sua altura? ")
    leia(altura)

    imc = peso / (altura * altura)

    se(imc < 18.5){
      escreva("Voc� esta abaixo do normal.")
    }
    senao se(imc >= 18.5 e imc < 25){
      escreva("Ohh que legau!! Seu peso � normal.")
    }
    senao se(imc >= 25 e imc < 30){
      escreva("Exesso de peso")
    }
    senao se(imc >= 30 e imc < 40){
      escreva("Obsidade classe 2")
    }
    senao{
      escreva("Obsidade classe 3")
      }
    }
  }
}
