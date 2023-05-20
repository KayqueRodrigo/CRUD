programa {
  funcao inicio() {
    inteiro idade, contador
    caracter nota

    escreva("Qual é sua idade: ")
    leia(idade)
    escreva("Qual a nota você da para a nossa loja: ")
    escreva("A -> Ótimo")
    escreva("B -> Bom")
    escreva("C -> Regular")
    escreva("D -> Ruim")
    escreva("E -> Péssimo")

    leia(nota)


    escolha(nota){
      caso a:
      escreva("Obrigado pela sua avaliação")
      a += a
      pare
      caso b
      escreva("Obrigado pela sua avaliação")
      b += b
      pare 
      caso c
      escreva("Obrigado pela sua avaliação")
      c += c
      pare
      caso d
      escreva("Obrigado pela sua avaliação")
      d +=d
      pare
      caso e
      escreva("Obrigado pela sua avaliação")
      e +=e
      pare

    }

  


  }
}
