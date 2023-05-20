programa {
  funcao inicio() {
    inteiro qntTime
    cadeia nome
    real altura = 0, banco = 0, media = 0

    escreva("Informe a quantidade que há no time de volei: ")
    leia(qntTime)

    para(inteiro i = qntTime; i > 0; i--){
      //escreva("Escreva o nome do jogador: ")
      //leia(nome)
      escreva("Informe a altura do jogador: ")
      leia(altura)

      banco += altura
      media = banco / qntTime

    }
    
    escreva(media)
  }
}
